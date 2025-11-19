
/**
 * Write a description of class pharmacy0001 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pharmacy
{
    public static void main(String[] args)
    {
        String[] Medicinename = {"Pain Killer", "Cough sirup", "eye drop", "moov spray"};
        float[] price= {20, 200, 350, 150};
        int[] stock= { 1000, 250, 770, 463};
        System.out.println(" Ausadhi pasal inventory report ");
        System.out.printf("%-15s %-20s %-20s\n", "Medicine Name", "Price per Tablet (NPR)", "Quantity in Stock");

        
        for(int i=0; i<Medicinename.length; i++)
        {
           System.out.printf("%-15s %-15f %-15d", Medicinename[i], price[i], stock[i]); 
        }
        int Totalvalueofstock=0;
        for(int a=0; a<Medicinename.length; a++)
        {
            Totalvalueofstock+= price[a]*stock[a];
        }
        System.out.println(" Total inventory value:(NPR)"+ Totalvalueofstock);
    }
}
