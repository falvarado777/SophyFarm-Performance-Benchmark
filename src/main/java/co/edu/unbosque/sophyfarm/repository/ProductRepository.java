package co.edu.unbosque.sophyfarm.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.sophyfarm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("""
    SELECT p FROM Product p
    WHERE
        (:query IS NULL OR :query = '' OR LOWER(p.nombre) LIKE LOWER(CONCAT('%', :query, '%')))
        AND (:category IS NULL OR p.categoria = :category)
        AND (:minPrice IS NULL OR p.precioActual >= :minPrice)
    """)
    List<Product> searchProducts(@Param("query") String query,
                                 @Param("category") Short category,
                                 @Param("minPrice") BigDecimal minPrice);

    @Query("SELECT p FROM Product p WHERE p.existencia <= p.stockMinimo")
    List<Product> findLowStockProducts();
}
