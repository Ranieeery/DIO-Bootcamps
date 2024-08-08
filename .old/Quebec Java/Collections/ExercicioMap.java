import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, Double> estadosNE = new LinkedHashMap<>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        System.out.println(estadosNE);

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        estadosNE.put("RN", 3534165d);

        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        if (!estadosNE.containsKey("PB")) estadosNE.put("PB", 4039277d);
        System.out.println(estadosNE);

        System.out.println("Exiba a população do estado PE: " + estadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Double> ordemEstadosNE = new LinkedHashMap<>(){{
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
            put("PB", 4039277d);
        }};
        System.out.println(ordemEstadosNE);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Double> abcEstadosNE = new TreeMap<>(estadosNE){{
        }};
        System.out.println(abcEstadosNE);


    }
}

