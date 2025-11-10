package co.edu.unbosque.sophyfarm.service;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import co.edu.unbosque.sophyfarm.repository.ReportRepository;

@Service
public class ReportService {

    private final ReportRepository repo;

    public ReportService(ReportRepository repo) {
        this.repo = repo;
    }

    public List<Map<String, Object>> getTopSelling(String period) {

        LocalDate today = LocalDate.now();
        LocalDate start;
        LocalDate end = today;

        switch (period.toLowerCase()) {
            case "day" -> start = today;
            case "week" -> start = today.minusWeeks(1);
            case "month" -> start = today.minusMonths(1);
            default -> throw new IllegalArgumentException("Invalid period: " + period);
        }

        List<Object[]> raw = repo.findTopSelling(start, end);

        // Convertir Object[] → Map
        return raw.stream().map(row -> {
            Map<String, Object> map = new HashMap<>();
            map.put("productoId", row[0]);
            map.put("cantidadVendida", row[1]);
            return map;
        }).toList();
    }
}
