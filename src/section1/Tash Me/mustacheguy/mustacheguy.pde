PImage mustache;
PImage friend;
void setup()
{
   size(1900,1000);
   friend = loadImage("friend2.jpg");
   friend.resize(width,height);
   mustache = loadImage("mustache.png");
   mustache.resize(200,100);
}

void draw()
{
background(friend);
if(mousePressed){
image(mustache,mouseX,mouseY);
}
}
