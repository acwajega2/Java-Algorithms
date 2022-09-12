package netWorkDelay;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Amazon {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(7);

        System.out.println(getHeaviestPackage(list));
    }


    public static int getHeaviestPackage(List<Integer> packageList){
        List<Integer> copyList = new ArrayList<>();

        if (packageList == null || packageList.size() == 0){
            return 0;
        }


        for (int i = 0; i < packageList.size() ; i++){

            if (i < packageList.size() - 1){
                System.out.println(packageList.get(i));
                if ((packageList.get(i) < packageList.get(i + 1)) ){

                    System.out.println(copyList);
                    copyList.add(packageList.get(i) + packageList.get(i + 1));
                }
            }


        }

        return copyList.stream().sorted((s1,s2) -> s2 - s1).collect(Collectors.toList()).get(0);
    }



}
