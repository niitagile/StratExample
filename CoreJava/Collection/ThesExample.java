package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
class Synonyms{
    String sysonyms[];
 
    public Synonyms(String[] sysonyms) {
        super();
        this.sysonyms = sysonyms;
    }
 
    /*public void display(){
    	for(String str : sysonyms){
    		System.out.println(str);
    	}
    }*/
 
    @Override
    public String toString() {
        return "" + Arrays.toString(sysonyms) + "";
    }

}
 //map(great, syn_obj)
 //map(good,syn_obj1)
class ThesExample{
    public static void main(String[] args) {
        
        HashMap<String,Synonyms> map=new HashMap<>();
        String arr[]= {"important","noble","famous"};
        map.put("great", new Synonyms(arr));
        String arr1[]= {"fine","superior","super"};
        map.put("good", new Synonyms(arr1));
        System.out.println(map.get("good"));
           // (map.get("good")).display();
                  
    }
}

