package heritage;


import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class TestClass {
/* correction
    Class<? mclass = Student.class;
    while(mClass != null){
        sop(mClass.getName());
         mClass = mClass.getSuperClass();
    }

    Pour interface :
        Class <?> [] mInt = mClass.getInterfaces();
        for(int i = 0; i< mInt.length; i++){
            System.out.println(mInt[i].getName());
         }
 */
    public static void main(String [] args){
     //   Class<?> mClass = Herritage2.class;
        ArrayList<String> testString = new ArrayList<>();
        Class myClass = testString.getClass();
        Class testClass = myClass.getSuperclass();
        while(testClass != null){
            System.out.println(testClass.getName());
            testClass = testClass.getSuperclass();
        }

        // Construire objet connu
        // forName, appliquer getConstructor, new instance
        try{
            Class classe = Class.forName("java.lang.String");
            Constructor c = String.class.getConstructor(classe);
            c.newInstance("testt");
        }catch(Exception e){
            e.getMessage();
        }


    }
    /* Recherche de la méthode String
        Class<?> mClass = String.class;
        Method method = null;
        try{
            method = mClass.gerMethod("substring", Integer.class, Integer.class);
        }catch(Exception e){
            sop(method!=null);
        }

     */



}

