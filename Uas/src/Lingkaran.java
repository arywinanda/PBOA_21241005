
public class Lingkaran{
        float r;
        float Diameter;

        public Lingkaran (float r,float Diameter){
            this.r = r;
            this.Diameter = Diameter;

        }
         void display(){
            float luas =(float)(Math.PI*r*r);
            Float keliling=(float)(2*3.14*r);
            System.out.println("keliling lingkaran:"+luas);
            System.out.println("luas Lingkaran :"+ keliling);

         }
    




    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran=new Lingkaran(20,40);
        System.out.println("Jari-jari: "+ lingkaran.r);
        System.out.println("Diameter:"+lingkaran.Diameter);
        lingkaran.display();
        
    }
}