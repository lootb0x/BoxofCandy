public class Main{
    public static void main(String[] args){

        Candy[][] cube = new Candy[4][3];
        BoxOfCandy a = new BoxOfCandy(cube);
        
        cube[0][1] = new Candy("lime");
        cube[1][1] = new Candy("orange");
        cube[3][1] = new Candy("lemon");
        cube[2][2] = new Candy("cherry");
        cube[3][2] = new Candy("grape");

      

    System.out.println(a.moveCandyToFirstRow(0));
    System.out.println(a.moveCandyToFirstRow(1));
    System.out.println(a.moveCandyToFirstRow(2));

    System.out.println();
    
    for(int x=0; x<cube.length; x++)
    {
        for(int y=0; y<cube[0].length; y++)
        {
            if(cube[x][y] != null)System.out.print(" " +cube[x][y].getFlavor());
            else System.out.print( "blank");
        }
        System.out.println();
}
System.out.println();


    Candy[][] candies2 = new Candy[3][5];
    BoxOfCandy b = new BoxOfCandy(candies2);

    candies2[0][0]=new Candy("lime");
    candies2[0][1]=new Candy("lime");
    candies2[0][3]=new Candy("lemon");
    candies2[1][0]=new Candy("orange");
    candies2[1][3]=new Candy("lime");
    candies2[1][4]=new Candy("lime");
    candies2[2][0]=new Candy("cherry");
    candies2[2][2]=new Candy("lemon");
    candies2[2][3]=new Candy("orange");



    for(int x=0; x<candies2.length; x++)
    {
        for(int y=0; y<candies2[0].length; y++)
        {
            if(candies2[x][y] != null)System.out.print(" "+ candies2[x][y].getFlavor());
            else System.out.print(" blank ");
        }
        System.out.println();

}

b.removeNextByFlavor("cherry");
b.removeNextByFlavor("lime");

   
System.out.println();

for(int x=0; x<candies2.length; x++)
    {
        for(int y=0; y<candies2[0].length; y++)
        {
            if(candies2[x][y] != null)System.out.print(" "+ candies2[x][y].getFlavor());
            else System.out.print(" blank ");
        }
        System.out.println();
}
}}