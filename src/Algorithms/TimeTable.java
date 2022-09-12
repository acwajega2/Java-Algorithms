package Algorithms;

import java.util.*;

public class TimeTable {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> requests = new HashMap<>();
        requests.put(
                "ada", new ArrayList<>(Arrays.asList(
                        new String[]{"mon", "tue", "wed", "fri", "sat", "sun"}
                ))
        );
        requests.put(
                "emma", new ArrayList<>(Arrays.asList(
                        new String[]{"tue", "wed", "thu", "sun"}
                ))
        );
        requests.put(
                "remy", new ArrayList<>(Arrays.asList(
                        new String[]{"mon", "sat"}
                ))
        );
        requests.put(
                "zach", new ArrayList<>(Arrays.asList(new String[]{}))
        );


        System.out.println(ChefScheduler(requests));
    }

    public static Map<String, List<String>> generateTimeTable(
            HashMap<String, ArrayList<String>> requests
    ) {
        Map<String, List<String>> timeTable = new HashMap<>();
        timeTable.put("mon", new ArrayList());
        timeTable.put("tue", new ArrayList());
        timeTable.put("wed", new ArrayList());
        timeTable.put("thu", new ArrayList());
        timeTable.put("fri", new ArrayList());
        timeTable.put("sat", new ArrayList());
        timeTable.put("sun", new ArrayList());


        for (Map.Entry<String, List<String>> timetaleDate : timeTable.entrySet()) {
            String dayOfWeek = timetaleDate.getKey();
            List<String> employeesOnShift = timetaleDate.getValue();

            for (Map.Entry<String, ArrayList<String>> EmployeeoffDays : requests.entrySet()) {
                String employee = EmployeeoffDays.getKey();
                List<String> offDays = EmployeeoffDays.getValue();

                if (!offDays.contains(dayOfWeek)) {
                    employeesOnShift.add(employee);
                }
            }
        }

        return timeTable;


        //  return true;
    }


    //---------> Clean timeTable --

    public static Boolean ChefScheduler(HashMap<String, ArrayList<String>> requests) {
        String specialEmployeesOnShift = getSpecialEmployeesOnShift(requests);
        Map<String, List<String>> timeTable = generateTimeTable(requests);

        for (Map.Entry<String, List<String>> entry : timeTable.entrySet()) {
            if (entry.getValue().size() > 2) {
                if (entry.getValue().contains(specialEmployeesOnShift)) {
                    //-------> we remove
                    entry.getValue().remove(specialEmployeesOnShift);
                }
            }


        }



        return validateTimeTable(timeTable,specialEmployeesOnShift);



    }


    //----> Validate TimeTable --------

    public static boolean validateTimeTable(Map<String, List<String>> timeTable, String specialEmployeesOnShift){
        int countTimeOfSpecialEmployeesOnShiftWorking = 0;

        for (Map.Entry<String, List<String>> entry : timeTable.entrySet()) {

            if (entry.getValue().size() < 2){
                return false;
            }
            if (entry.getValue().contains(specialEmployeesOnShift)){
                countTimeOfSpecialEmployeesOnShiftWorking +=1;
            }


        }

        if (countTimeOfSpecialEmployeesOnShiftWorking > 5){
            return false;
        }

        return true;
    }

    public static String getSpecialEmployeesOnShift(HashMap<String, ArrayList<String>> requests) {
        String specialEmployeesOnShift = "";
        for (Map.Entry<String, ArrayList<String>> entry : requests.entrySet()) {
            if (entry.getValue().size() == 0) {
                specialEmployeesOnShift = entry.getKey();
                break;
            }
        }

        return specialEmployeesOnShift;
    }

}
