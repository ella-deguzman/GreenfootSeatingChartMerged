import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
import java.io.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.Constructor;

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.
        
        // File file = new File("period2.txt");
        // try{
        // BufferedReader br = new BufferedReader(new FileReader(file));
        // String st;
        // int i = 1;
        // int j = 1;
        // while ((st = br.readLine()) != null){
        //     String[] params = st.split("[,]", 0);
        //     Class<?> clazz = Class.forName(params[0]);
        //     Constructor<?> ctor = clazz.getConstructor(String.class, String.class, int.class, int.class);
        //     Student object = (Student) ctor.newInstance(new Object[] {params[1], params[2], i++, j++ });
        //     addObject(object, i++, j++);
        // }}
        // catch (Exception e){
        //     System.out.println("File not found");
        // }

        NibodhVallapureddy nibodhvallapureddy = new NibodhVallapureddy("Nibodh", "Vallapureddy", 1, 1);
        addObject(nibodhvallapureddy, 1, 1);
        nibodhvallapureddy.sitDown();
        
        KarenZhao karenzhao = new KarenZhao("Karen", "Zhao", 1, 2);
        addObject(karenzhao, 1, 2);
        karenzhao.sitDown();
        
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 1, 3);
        addObject(chelsealee, 1, 3);
        chelsealee.sitDown();

        JoshuaChon joshuachon = new JoshuaChon("Joshua", "Chon", 2, 1);
        addObject(joshuachon, 2, 1);
        joshuachon.sitDown();
        
        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();

        EllaDeGuzman elladeguzman = new EllaDeGuzman("Ella", "DeGuzman", 2, 3);
        addObject(elladeguzman, 2, 3);
        elladeguzman.sitDown();
        
       

    }
}

