import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class Feature10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(String zone : ZoneId.getAvailableZoneIds()){
            list.add(zone);
        }
        System.out.println("Time and Date as per the zones");
        for(String zone: list){
            String z = zone;
            LocalTime t = LocalTime.now(ZoneId.of(z));
            LocalDate d = LocalDate.now(ZoneId.of(z));
            System.out.println("_________________________");
            System.out.println(zone+" Time"+": "+t+" Date"+": "+d);
        }
    }
}
