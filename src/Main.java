import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        String arr = "Anh tien be de khong co cu";
        int number = arr.length();
        arr = arr.toLowerCase();
        char[] arrChar = new char[number];
        for (int i = 0; i < number; i++) {
            arrChar[i] = arr.charAt(i);
        }
        for (int i=0;i<number;i++){
            if(treeMap.isEmpty()){
                treeMap.put(arrChar[i],1);
            }else {
                if(checkKey(treeMap,arrChar[i])[0]==1){
                    treeMap.put(arrChar[i],checkKey(treeMap,arrChar[i])[1]+1);
                }else {
                    treeMap.put(arrChar[i],1);
                }
            }
        }
        for (Map.Entry<Character,Integer> s:treeMap.entrySet()){
           System.out.println(s.getKey() + " " +s.getValue());
        }
    }
    private static int[] checkKey(TreeMap<Character,Integer> treeMap,char chars){
        int[] result={0,0};
        for (Map.Entry<Character,Integer> s:treeMap.entrySet()){
            if(s.getKey()==chars){
                result[0]=1;
                result[1]=s.getValue();
            }
        }
        return result;
    }
}