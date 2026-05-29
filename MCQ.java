import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MCQ.class" width="1000" height="1000">
</applet>
*/
public class MCQ extends Applet implements ItemListener
{
Label a,b,c,d,e,f;
Checkbox g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
CheckboxGroup abc,def,ghi,jkl,mno;
String msg="";
int marks=0;
Label m1;

public void init()
{
setLayout(null);
setBackground(Color.cyan);

a=new Label("Online MCQ Test");
add(a);
a.setBounds(650,50,150,30);

abc=new CheckboxGroup();
b=new Label("Q.1] Which is the most popular web-series?");
add(b);
g=new Checkbox("Money Heist",false,abc);
h=new Checkbox("Squid Game",false,abc);
i=new Checkbox("The Family Man",false,abc);
j=new Checkbox("Moon Knight",false,abc);
add(g);
add(h);
add(i);
add(j);
g.addItemListener(this);
h.addItemListener(this);
i.addItemListener(this);
j.addItemListener(this);
b.setBounds(450,100,300,30);
g.setBounds(480,130,100,30);
h.setBounds(600,130,100,30);
i.setBounds(720,130,110,30);
j.setBounds(840,130,100,30);

def=new CheckboxGroup();
c=new Label("Q.2] Who is the creater of Java?");
add(c);
k=new Checkbox("James Gosling",false,def);
l=new Checkbox("Bill Gates",false,def);
m=new Checkbox("Steve Jobs",false,def);
n=new Checkbox("Mark Zuckerberg",false,def);
add(k);
add(l);
add(m);
add(n);
k.addItemListener(this);
l.addItemListener(this);
m.addItemListener(this);
n.addItemListener(this);
c.setBounds(450,160,300,30);
k.setBounds(480,190,120,30);
l.setBounds(620,190,100,30);
m.setBounds(720,190,110,30);
n.setBounds(840,190,140,30);


ghi=new CheckboxGroup();
d=new Label("Q.3] Which dog breed is strongest one?");
add(d);
o=new Checkbox("Kangaroo Dog",false,ghi);
p=new Checkbox("American Pitbull Terrier",false,ghi);
q=new Checkbox("German Shepherd",false,ghi);
r=new Checkbox("Rottweiler",false,ghi);
add(o);
add(p);
add(q);
add(r);
o.addItemListener(this);
p.addItemListener(this);
q.addItemListener(this);
r.addItemListener(this);
d.setBounds(450,220,300,30);
o.setBounds(480,250,120,30);
p.setBounds(620,250,150,30);
q.setBounds(795,250,120,30);
r.setBounds(950,250,150,30);


jkl=new CheckboxGroup();
e=new Label("Q.4] Who is the creator of C++?");
add(e);
s=new Checkbox("Bajarne Stroustrup",false,jkl);
t=new Checkbox("James Gosling",false,jkl);
u=new Checkbox("Dennis Ritchie",false,jkl);
v=new Checkbox("Bill Gates",false,jkl);
add(s);
add(t);
add(u);
add(v);
s.addItemListener(this);
t.addItemListener(this);
u.addItemListener(this);
v.addItemListener(this);
e.setBounds(450,280,300,30);
s.setBounds(480,310,120,30);
t.setBounds(640,310,100,30);
u.setBounds(790,310,100,30);
v.setBounds(920,310,100,30);


mno=new CheckboxGroup();
f=new Label("Q.5] Who was the father of Sambhaji Maharaj?");
add(f);
w=new Checkbox("Chhatrapati Shivaji Maharaj",false,mno);
x=new Checkbox("Aurangzeb",false,mno);
y=new Checkbox("Baji Rao I",false,mno);
z=new Checkbox("Malhar Rao Holkar",false,mno);
add(w);
add(x);
add(y);
add(z);
w.addItemListener(this);
x.addItemListener(this);
y.addItemListener(this);
z.addItemListener(this);
f.setBounds(450,340,300,30);
w.setBounds(480,370,180,30);
x.setBounds(700,370,80,30);
y.setBounds(840,370,100,30);
z.setBounds(980,370,150,30);

m1=new Label("Obtained Marks:0");
add(m1);
m1.setBounds(650,450,200,30);

}
public void itemStateChanged(ItemEvent i)
{
int m2=0;
if(g.getState())
{
m2+=5;	
}
if(k.getState())
{
m2+=5;	
}
if(q.getState())
{
m2+=5;	
}
if(s.getState())
{
m2+=5;	
}
if(w.getState())
{
m2+=5;	
}

m1.setText("Obtained marks : "+m2);


}

}


