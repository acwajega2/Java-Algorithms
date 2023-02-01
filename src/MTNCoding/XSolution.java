package MTNCoding;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {EAST: {DAY:"Mon%2C%20Oct%2003%2C%202022"
 * "VIEW": "EAST",
 *  *         "SIM_PH": "352",
 *  *         "SIM_DTPH": "2%2C142",
 *  *         "SIM_MTPH": "7%2C004",
 *  *         "SIM_PMTPH": "8%2C625",
 *  *         "SIM_VAR": "-1%2C621",
 *  *         "SIM_MOM": "-18.79%25",
 *  *         "POS_PH": "275",
 *  *         "POS_DTPH": "761",
 *  *         "POS_TGT": "1%2C128",
 *  *         "POS_VAR": "-367",
 *  *         "POS_SCR": "67.46%25",}}
 *
 * region_list = [
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "EAST",
 *         "SIM_PH": "352",
 *         "SIM_DTPH": "2%2C142",
 *         "SIM_MTPH": "7%2C004",
 *         "SIM_PMTPH": "8%2C625",
 *         "SIM_VAR": "-1%2C621",
 *         "SIM_MOM": "-18.79%25",
 *         "POS_PH": "275",
 *         "POS_DTPH": "761",
 *         "POS_TGT": "1%2C128",
 *         "POS_VAR": "-367",
 *         "POS_SCR": "67.46%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "GCENT",
 *         "SIM_PH": "291",
 *         "SIM_DTPH": "1%2C594",
 *         "SIM_MTPH": "4%2C790",
 *         "SIM_PMTPH": "6%2C291",
 *         "SIM_VAR": "-1%2C501",
 *         "SIM_MOM": "-23.86%25",
 *         "POS_PH": "219",
 *         "POS_DTPH": "620",
 *         "POS_TGT": "1%2C119",
 *         "POS_VAR": "-499",
 *         "POS_SCR": "55.41%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "KCENT",
 *         "SIM_PH": "245",
 *         "SIM_DTPH": "1%2C576",
 *         "SIM_MTPH": "4%2C378",
 *         "SIM_PMTPH": "5%2C491",
 *         "SIM_VAR": "-1%2C113",
 *         "SIM_MOM": "-20.27%25",
 *         "POS_PH": "191",
 *         "POS_DTPH": "604",
 *         "POS_TGT": "1%2C113",
 *         "POS_VAR": "-509",
 *         "POS_SCR": "54.27%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "NORTH",
 *         "SIM_PH": "403",
 *         "SIM_DTPH": "2%2C218",
 *         "SIM_MTPH": "7%2C595",
 *         "SIM_PMTPH": "9%2C961",
 *         "SIM_VAR": "-2%2C366",
 *         "SIM_MOM": "-23.75%25",
 *         "POS_PH": "277",
 *         "POS_DTPH": "692",
 *         "POS_TGT": "921",
 *         "POS_VAR": "-229",
 *         "POS_SCR": "75.14%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "SWEST",
 *         "SIM_PH": "194",
 *         "SIM_DTPH": "1%2C001",
 *         "SIM_MTPH": "3%2C356",
 *         "SIM_PMTPH": "4%2C609",
 *         "SIM_VAR": "-1%2C253",
 *         "SIM_MOM": "-27.19%25",
 *         "POS_PH": "152",
 *         "POS_DTPH": "443",
 *         "POS_TGT": "612",
 *         "POS_VAR": "-169",
 *         "POS_SCR": "72.39%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "WEST",
 *         "SIM_PH": "280",
 *         "SIM_DTPH": "1%2C577",
 *         "SIM_MTPH": "5%2C459",
 *         "SIM_PMTPH": "7%2C154",
 *         "SIM_VAR": "-1%2C695",
 *         "SIM_MOM": "-23.69%25",
 *         "POS_PH": "204",
 *         "POS_DTPH": "596",
 *         "POS_TGT": "866",
 *         "POS_VAR": "-270",
 *         "POS_SCR": "68.82%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "NATNL",
 *         "SIM_PH": "1%2C765",
 *         "SIM_DTPH": "10%2C108",
 *         "SIM_MTPH": "32%2C582",
 *         "SIM_PMTPH": "42%2C304",
 *         "SIM_VAR": "-9%2C722",
 *         "SIM_MOM": "-22.98%25",
 *         "POS_PH": "1%2C318",
 *         "POS_DTPH": "3%2C716",
 *         "POS_TGT": "5%2C763",
 *         "POS_VAR": "-2%2C047",
 *         "POS_SCR": "64.48%25",
 *     },
 *     {
 *         "DAY": "Mon%2C%20Oct%2003%2C%202022",
 *         "VIEW": "UNNON,natil,",
 *         "SIM_PH": "0",
 *         "SIM_DTPH": "0",
 *         "SIM_MTPH": "0",
 *         "SIM_PMTPH": "173",
 *         "SIM_VAR": "-173",
 *         "SIM_MOM": "-100.00%25",
 *         "POS_PH": "0",
 *         "POS_DTPH": "0",
 *         "POS_TGT": "3",
 *         "POS_VAR": "-3",
 *         "POS_SCR": "0.00%25",
 *     },
 * ]
 *
 * **/



/*
*
* {view:{DayMon,viewuni,WEST}}
*
*
* */

public class XSolution {
    public static void main(String[] args) {

        List<HashMap<String,String>> input = new ArrayList<>();
        HashMap<String,String> val1 = new HashMap<>();
        val1.put("DAY", "Mon%2C%20Oct%2003%2C%202022");
        val1.put("VIEW","UNNON");
        val1.put("SIM_PH", "0");
        val1.put("x", "0");
        val1.put("t", "0");
        val1.put("u", "0");
        val1.put("c", "0");


        HashMap<String,String> val2 = new HashMap<>();
        val2.put("DAY", "Mon%2C%20Oct%2003%2C%202022");
        val2.put("VIEW","WEST");
        val2.put("SIM_PH", "0");
        val2.put("x", "0");
        val2.put("t", "0");
        val2.put("u", "0");
        val2.put("c", "0");

        input.add(val1);
        input.add(val2);
        System.out.println(solve(input));

    }

    static HashMap<String,HashMap<String,String>> solve(List<HashMap<String, String>> input){

        HashMap<String,HashMap<String,String>> result = new HashMap<>();

        for (HashMap<String,String> entry : input){
          //  System.out.println(entry);
            for(Map.Entry<String,String> val : entry.entrySet()){

                if (val.getKey().equalsIgnoreCase("VIEW")){
                    result.put(val.getValue(),entry);
                }
            }
        }


        return result;

    }

}
