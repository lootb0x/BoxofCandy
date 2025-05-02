public class BoxOfCandy
{
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    public BoxOfCandy(Candy[][] pop)
    {
        box=pop;
    }
    /**
    * Moves one piece of candy in column col, if necessary and possible, so that the box
    * element in row 0 of column col contains a piece of candy, as described in part (a).
    * Returns false if there is no piece of candy in column col and returns true otherwise.
    * Precondition: col is a valid column index in box.
    */
    public boolean moveCandyToFirstRow(int col)
    {
        if(box[0][col]!= null) return true;
        for(int x=0; x<box.length; x++)
        {
            if(box[x][col]!= null) 
            {
                box[0][col] = box[x][col];
                box[x][col] = null;
                return true;
            }
        }
        return false;
    }

    /**
    * Removes from box and returns a piece of candy with flavor specified by the parameter, or
    * returns null if no such piece is found, as described in part (b)
    */
    public Candy removeNextByFlavor(String flavor)
    { 
       Candy temp = new Candy(flavor);
        for(int x=box.length-1; x>-1; x--)
        {
            for(int y=0; y<box[0].length; y++)
            {
            if(box[x][y] != null)
            {
                if(box[x][y].getFlavor()== temp.getFlavor())
                {
                    box[x][y] = null;
                    return temp;
                }
            }
        }
        }
        return null;
    }


    // There may be instance variables, constructors, and methods that are not shown.
}