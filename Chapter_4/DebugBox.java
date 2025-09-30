

public class DebugBox
{
private int width;
private int length;
private int height;
public DebugBox()
{
length = 1;
width = 1;
height = 1;
}
public DebugBox(int w, int l, int h)
{
this.width = w;
this.length = l;
this.height = h;
}
public void showData()
{
System.out.println("Width: " + width + " Length: " + length +  " Height: " + height);
}
public double getVolume()
{
double vol = length * width * height;
System.out.println("Volume: " + vol);
return vol;
}

}
