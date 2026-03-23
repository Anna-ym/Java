
import java.io.IOException;
                                    //innerclass pgm 5
public class cpu {
    float price;
    
    cpu(float price){
        this.price=price;
    }
   
    public class processor{
        int cores;
        String manup;
    
    
    processor(int cores,String manup){
        this.cores=cores;
        this.manup=manup;
    }
    void display(){
        System.out.println("Processor cores: "+cores);
        System.out.println("Manufacturer: "+manup);
    }
}
static class ram{
    int memory;
    String manup;

    ram(int memory,String manup){
        this.memory=memory;
        this.manup=manup;
    }
    void display(){
        System.out.println("Ram memory: "+memory);
        System.out.println("Manufacturer: "+manup);
    }


}
public static void main(String args[])throws IOException{
    cpu c=new cpu(25000);
    cpu.processor p=c.new processor(8,"Intel");
     cpu.ram r = new cpu.ram(16, "Corsair");

        System.out.println("CPU Price: " + c.price);
        p.display();
        r.display();
    }
}

