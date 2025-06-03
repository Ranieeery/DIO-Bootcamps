import java.util.*;

public class OrganizadorHorarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a quantidade de horarios
        int n = Integer.parseInt(sc.nextLine());

        // Usamos TreeSet para armazenar horarios unicos e ordenados automaticamente
        Set<String> horarios = new TreeSet<>();

        // TODO: leia cada horario e adicione ao conjunto
        for (int i = 0; i < n; i++) {
            String horario = sc.nextLine().trim();
            horarios.add(horario);
        }

        // TODO: Imprima os horarios unicos em ordem crescente:
        for (String horario : horarios) {
            System.out.println(horario);
        }

        // TODO: Imprima o total de horarios unicos:
        System.out.println("Total de horarios unicos: " + horarios.size());

        sc.close();
    }
}