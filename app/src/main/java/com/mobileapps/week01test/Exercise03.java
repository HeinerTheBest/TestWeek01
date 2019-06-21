package com.mobileapps.week01test;

public class Exercise03
{
    /*
            3. Complete the infected Room code challenge
    * */

    private static int acum = 1;

    static Room[][] noInfection = new Room[][] {
            {new Room(true), new Room(false), new Room(true), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(true), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(true), new Room(false), new Room(true), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(true), new
                    Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(true), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(true), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) }
    };

    static Room[][] horizontalTrue = new Room[][] {
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(true), new Room(true), new
                    Room(true), new Room(true), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) }
    };

    static Room[][] verticalTrue = new Room[][] {
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(true), new
                    Room(true), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(true), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) },
            {new Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false), new Room(false), new Room(false), new Room(false), new
                    Room(false) }
    };


    //Class
    public static class Room
    {
        final boolean isInfected;
        boolean visited = false;
        Room(boolean infected)
        {
            isInfected = infected;
        }
    }

    //Logic
    private static int isOutbreak(Room[][] floor)
    {
        for (int i = 0; i < floor.length ; i++)
        {
            for (int j = 0; j < floor[0].length; j++)
            {
                if(floor[i][j].isInfected && !floor[i][j].visited)
                {

                    if(checkUp(floor,i,j) == 4 || checkDown(floor,i,j) == 4)
                        return 1;

                    if(checkRight(floor,i,j) == 4 || checkLeft(floor,i,j) == 4)
                        return 2;
                }
            }
        }
        return 0;
    }

    private static int checkUp(Room[][] floor, int i, int j)
    {
        if(i != 0)
        {
            if(floor[i-1][j].isInfected)
            {
              return acum = 1 + checkUp(floor,i-1,j);
            }
        }
        return 0;
    }

    private static int checkDown(Room[][] floor, int i, int j)
    {
        if(i != floor.length)
        {
            if(floor[i+1][j].isInfected)
            {
                return acum = 1 + checkDown(floor,i+1,j);
            }
        }
        return 0;
    }

    private static int checkRight(Room[][] floor, int i, int j)
    {
        if(j != floor[0].length-1)
        {
            if(floor[i][j+1].isInfected)
            {
                return acum = 1 + checkRight(floor,i,j+1);
            }
        }
        return 0;
    }

    private static int checkLeft(Room[][] floor, int i, int j)
    {
        if(j != 0)
        {
            if(floor[i][j-1].isInfected)
            {
                return acum = 1 + checkLeft(floor,i,j-1);
            }
        }
        return 0;
    }



    //main
    public static void main(String[] args)
    {
        switch (isOutbreak(horizontalTrue))
        {
            case 0:
                System.out.println("The room is not infected");
                break;

            case 1:
                System.out.println("The room is Vertical infected");
                break;

            case 2:
                System.out.println("The room is Horizontal infected");
                break;
        }
    }

}
