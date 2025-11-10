package co.edu.unbosque.sophyfarm.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "elemento")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "codigo_elemento")
    private String codigo;

    @Column(name = "nombre_elemento")
    private String nombre;

    @Column(name = "descripcion_elemento")
    private String descripcion;

    @Column(name = "categoria_elemento")
    private Short categoria;

    @Column(name = "unidad_elemento")
    private Short unidad;

    @Column(name = "existencia_elemento")
    private Integer existencia;

    @Column(name = "bodega_elemento")
    private Integer bodega;

    @Column(name = "precio_venta_ac")
    private BigDecimal precioActual;

    @Column(name = "precio_venta_an")
    private BigDecimal precioAnterior;

    @Column(name = "costo_venta")
    private BigDecimal costo;

    @Column(name = "margen_utilidad")
    private Double margenUtilidad;

    @Column(name = "tiene_iva")
    private String tieneIva;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    @Column(name = "stock_maximo")
    private Integer stockMaximo;

    @Column(name = "estado")
    private String estado;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Short getCategoria() { return categoria; }
    public void setCategoria(Short categoria) { this.categoria = categoria; }

    public Short getUnidad() { return unidad; }
    public void setUnidad(Short unidad) { this.unidad = unidad; }

    public Integer getExistencia() { return existencia; }
    public void setExistencia(Integer existencia) { this.existencia = existencia; }

    public Integer getBodega() { return bodega; }
    public void setBodega(Integer bodega) { this.bodega = bodega; }

    public BigDecimal getPrecioActual() { return precioActual; }
    public void setPrecioActual(BigDecimal precioActual) { this.precioActual = precioActual; }

    public BigDecimal getPrecioAnterior() { return precioAnterior; }
    public void setPrecioAnterior(BigDecimal precioAnterior) { this.precioAnterior = precioAnterior; }

    public BigDecimal getCosto() { return costo; }
    public void setCosto(BigDecimal costo) { this.costo = costo; }

    public Double getMargenUtilidad() { return margenUtilidad; }
    public void setMargenUtilidad(Double margenUtilidad) { this.margenUtilidad = margenUtilidad; }

    public String getTieneIva() { return tieneIva; }
    public void setTieneIva(String tieneIva) { this.tieneIva = tieneIva; }

    public Integer getStockMinimo() { return stockMinimo; }
    public void setStockMinimo(Integer stockMinimo) { this.stockMinimo = stockMinimo; }

    public Integer getStockMaximo() { return stockMaximo; }
    public void setStockMaximo(Integer stockMaximo) { this.stockMaximo = stockMaximo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
