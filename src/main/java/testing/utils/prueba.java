package testing.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class prueba {
    public static List<String[]> leer(String path) throws IOException {
        List<String[]> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.toLowerCase().contains("email")) continue;
                String[] campos = linea.split(",");
                datos.add(campos);
            }
        }
        return datos;
    }
}
