PImage rainbow;
PImage unicorn;
void setup()
{
size(1900,1000);
rainbow = loadImage("rainbow.jpeg");
rainbow.resize(width,height);
unicorn = loadImage("unicorn.jpg");
unicorn.resize(200,300);
}
void draw()
{
background(rainbow);
if(mousePressed)
{
  image(unicorn,mouseX,mouseY);
}
}
