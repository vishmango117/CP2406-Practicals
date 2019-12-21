package Task2;

public class DemoRocks{

    // Main Method
    public static void main(String[] args) {

        //Instantiating Objects
        Rock unknown_rock = new Rock(50,500);
        IgenousRock my_igneous_rock = new IgenousRock(100,1000);
        SedimentaryRock my_sedimentary_rock = new SedimentaryRock(150, 750);
        MetamorphicRock my_metamorphic_rock = new MetamorphicRock(200, 2000);

        //Printing Information about Unknown Rock
        System.out.println("Rock Information (Unknown Rock)");
        System.out.println("Rock Description: "+unknown_rock.getDescription());
        System.out.println("Rock Sample Size: "+unknown_rock.getNo_of_samples());
        System.out.println("Rock Weight: "+unknown_rock.getNo_of_samples());
        System.out.println();

        //Printing Information about Igneous Rock
        System.out.println("Rock Information (Igneous Rock)");
        System.out.println("Rock Description: "+my_igneous_rock.getDescription());
        System.out.println("Rock Sample Size: "+my_igneous_rock.getNo_of_samples());
        System.out.println("Rock Weight: "+my_igneous_rock.getNo_of_samples());
        System.out.println();

        //Printing Information about Sedimentary Rock
        System.out.println("Rock Information (Sedimentary Rock)");
        System.out.println("Rock Description: "+my_sedimentary_rock.getDescription());
        System.out.println("Rock Sample Size: "+my_sedimentary_rock.getNo_of_samples());
        System.out.println("Rock Weight: "+my_sedimentary_rock.getNo_of_samples());
        System.out.println();

        //Printing Information about Metamorphic Rock
        System.out.println("Rock Information (Metamorphic Rock)");
        System.out.println("Rock Description: "+my_metamorphic_rock.getDescription());
        System.out.println("Rock Sample Size: "+my_metamorphic_rock.getNo_of_samples());
        System.out.println("Rock Weight: "+my_metamorphic_rock.getNo_of_samples());
        System.out.println();

    }
}
