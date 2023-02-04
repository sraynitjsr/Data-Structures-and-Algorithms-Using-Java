import java.util.*;
class DataSet {
    private int number;
    private int frequency;
    public int getNumber() {
        return this.number;
    }
    public int getFrequency() {
        return this.frequency;
    }
    public DataSet(int a, int b) {
        this.number = a;
        this.frequency = b;
    }
}

class DataSetComparator implements Comparator<DataSet> {
    public int compare(DataSet a, DataSet b) {
        return b.getFrequency() - a.getFrequency();
    }
}

class My_Sort_by_Frequency {
    public static void start() {
        int myArray[] = {1, 1, 3, 3, 4, 1, 2, 5, 6, 5, 5, 5, 6, 7};
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        ArrayList<DataSet> dataSets = new ArrayList<>();

        for(int i = 0; i < myArray.length; i++) {
            int currentKey = myArray[i];
            if(hashMap.containsKey(currentKey)) {
                hashMap.put(currentKey, hashMap.get(currentKey) + 1);
            } else {
                hashMap.put(currentKey, 1);
            }
        }

        hashMap.forEach((k,v) -> {
            dataSets.add(new DataSet(k, v));
        });

        Collections.sort(dataSets, new DataSetComparator());

        dataSets.forEach(dataSet -> {
            System.out.println("Number => " + dataSet.getNumber() + " Frequency => " + dataSet.getFrequency());
        });
    }
}
