package org.examlabs.oca1;


public class Q64
{
    public int x;
    public int y;
    public int sum;

    public Q64(int nx, int ny)
    {
        x = nx; y =ny;
        updateSum();
    }

    public void setX(int nx)
    {
        x = nx;
        updateSum();
    }

    public void setY(int ny)
    {
        x = ny;
        updateSum();
    }

    void updateSum()
    {
        sum = x + y;
    }
}

