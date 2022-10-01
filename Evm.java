import java.util.Comparator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class UserException extends Exception
{
    String a;
    UserException(String x)
    {a=x;}
    public String toString()
    {
        return "Exception! given Voter ID "+a+" is all numeric wrong\n as per voterid format";
    }
}

class Demo{public static  ArrayList<Integer> list=new ArrayList<Integer>();
public static TreeMap<Integer,String> vt=new TreeMap<Integer,String>(new UserComp());public static int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0,x7=0;
public static TreeMap<Integer,Integer> ls1=new TreeMap<Integer,Integer>();public static int x=1;
public static int timer;}

class ElectionMC extends Demo
{   int x;
     ElectionMC()
   {
       JFrame f=new JFrame("EVM");JLabel title = new JLabel("ELECTION COMMISION");JLabel head=new JLabel("Electronic Voting Machine");JCheckBox c3=new JCheckBox("DECLARE RESULT");
       title.setFont(new Font("Algerian", Font.BOLD, 30));title.setForeground(Color.WHITE);
       title.setBounds(300,20,380,35);title.setOpaque(false);
       ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\Evm.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
       JLabel nearhead=new JLabel();nearhead.setIcon(imageIcon);nearhead.setBounds(210,80,100,55);
       head.setFont(new Font("Courier New",Font.ITALIC,30));head.setForeground(Color.BLUE);
       head.setBounds(280,80,460,55);
       //head.setIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\Evm.png"));
       head.setOpaque(true);head.setBackground(Color.WHITE);
       f.setLayout(null);
        f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\a.jpg")));
        f.setSize(1000,1000);
        JRadioButton c1,c2,k3;JButton b=new JButton("Continue");ButtonGroup g=new ButtonGroup();
        c1=new JRadioButton();JLabel l2=new JLabel("VOTER");
        c2=new JRadioButton();JLabel l1=new JLabel("ADMIN");k3=new JRadioButton("RESULTS");g.add(c1);g.add(c2);g.add(k3);
        l1.setFont(new Font("ALGERIAN",Font.BOLD,40));l1.setForeground(Color.GREEN);
        l2.setFont(new Font("ALGERIAN",Font.BOLD,40));l2.setForeground(Color.yellow);
        k3.setFont(new Font("ALGERIAN",Font.BOLD,40));k3.setForeground(Color.MAGENTA);
        c1.setBounds(540,240,80,30);c2.setBounds(160,240,80,30);c1.setOpaque(false);c2.setOpaque(false);k3.setOpaque(false);
        b.setBounds(400,500,180,60);l1.setBounds(200,240,160,40);l2.setBounds(580,240,160,40);k3.setBounds(380,320,220,30);
        f.add(c1);f.add(c2);f.add(b);f.add(title);f.add(head);f.add(l1);f.add(l2);f.add(nearhead);f.add(k3);
        f.setVisible(true);b.setFont(new Font("Courier New",Font.ITALIC,30));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
      if(c1.isSelected())
      {
        if(timer>=1)
        {
            System.out.println(timer);
            new Election();
        }
        else{System.out.println(timer);new Election(timer);}
      }
      else if(c2.isSelected())
      {
        new Admin();go();
        System.out.println("int main func "+x);
        
      }
      else if(k3.isSelected())
      {
        go();
        if(x>=2){System.out.println(timer);new Declare();}
        else{System.out.println(timer);new Declare(timer);}  
        
      }
    }});
 }
 void go(){ x=super.timer;
    System.out.println("here "+x);}
}
class UserComp  extends Demo implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        return b-a;
    }
}
class Declare extends Demo
{
    ImageIcon i1 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\1.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
    ImageIcon i2 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\2.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i3 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\3.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i4 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\4.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i5 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\5.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i6= new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\6.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i7 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\7.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    JFrame r= new JFrame("Results");
    JLabel l=new JLabel();JLabel m=new JLabel("Won This Election!");
    Declare()
    {
        r.setSize(600,600);r.setLayout(null);r.setVisible(true);r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int x=vt.firstEntry().getKey();
        String s=vt.firstEntry().getValue();
        r.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\flag.png")));
        switch(s)
        {
            case "1":l=new JLabel("PSB-Public Soceital Broadway Party");l.setIcon(i1);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(150,50,800,80);r.add(l);break;
            case "2":l=new JLabel("CCI-Contradiction Committee of India");l.setIcon(i2);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(50,50,800,80);r.add(l);break;
            case "3":l=new JLabel("MKP-Masdoor Kisaan Party");l.setIcon(i3);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(50,50,800,80);r.add(l);break;
            case "4":l=new JLabel("ATK-All India Thozhilaali Kazhagam");l.setIcon(i4);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(50,50,800,80);r.add(l);break;
            case "5":l=new JLabel("SRF-Surya Raajas Front");l.setIcon(i5);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(50,50,800,80);r.add(l);break;
            case "6":l=new JLabel("PVC-Public Voice Committee");l.setIcon(i6);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(50,50,800,80);r.add(l);break;
            case "7":l=new JLabel("KTP-Karnataka Trinamol Party");l.setIcon(i7);l.setOpaque(true);l.setFont(new Font("Courier New",Font.ITALIC,30));l.setBounds(50,50,800,80);r.add(l);break;
        }
        m.setBounds(80,400,500,60);m.setFont(new Font("Algerian", Font.BOLD, 40));m.setForeground(Color.BLACK);m.setOpaque(true);
        r.add(m);r.setSize(1000,1000);r.setLayout(null);r.setVisible(true);r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    Declare(int x)
    {
        r.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\flag.png")));
        JLabel k=new JLabel("VOTING PROCESS HASNT  ");
        JLabel k1=new JLabel("STARTED YET PLEASE WAIT!");r.add(k1);
        r.add(k);r.setSize(1000,1000);r.setLayout(null);r.setVisible(true);r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        k.setBounds(80,400,600,60);k.setFont(new Font("Serif",Font.BOLD,40));k.setOpaque(true);;
        k1.setBounds(80,460,600,60);k1.setFont(new Font("Serif",Font.BOLD,40));k1.setOpaque(true);
               
        
    }
}
class Voters {
    int VoterId;
    String VoterName;
    int age;
    public Voters() { }
    public Voters(int vid, int ag, String name) {
        this.age = ag;
        this.VoterId = vid;
        this.VoterName = name;

    }
}
class Election extends Demo{
    JButton b2, b3;
    JLabel l1, l2, l3,l4;
    JTextField j1, j2, j3;
    JTextArea ta;Boolean y=false;
    ArrayList<Voters> list2 = new ArrayList<Voters>();
    public static void  idchecker(String s) throws UserException
    {
        if(s.chars().allMatch(Character::isDigit))
        {
            throw new UserException(s);
        }
    }
    Election() 
    {
        JFrame f1 = new JFrame("Elections");
        f1.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\3.jpg")));
        b3 = new JButton(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\icon.png"));l1 = new JLabel("Voter-ID:");j1 = new JTextField(8);
        l2 = new JLabel("Name:");j2 = new JTextField(8);l3 = new JLabel("Age:");j3 = new JTextField(8);l4=new JLabel("Submit!");
        l1.setBounds(0,40,280,30);l1.setFont(new Font("Courier New",Font.ITALIC,30));l1.setForeground(Color.red);
        j1.setBounds(160,45,140,25);j2.setBounds(700,45,140,25);j3.setBounds(440,320,140,25);l4.setFont(new Font("Courier New",Font.ITALIC,30));l4.setForeground(Color.blue);
        l2.setBounds(600,40,280,30);l2.setFont(new Font("Courier New",Font.ITALIC,30));
        l3.setBounds(330,300,280,50);l3.setFont(new Font("Courier New",Font.ITALIC,40));l3.setForeground(Color.red);
        f1.setLayout(null);b3.setBounds(620,290,70,40);l4.setBounds(610,330,140,35);l4.setOpaque(true);
        f1.add(l1);f1.add(j1);f1.add(l2);f1.add(j2);f1.add(l3);
        f1.add(j3);f1.add(b3);f1.add(l4);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try{
                String id=j1.getText();
                String name=j2.getText();
                int age = Integer.parseInt(j3.getText());
                if (age<18)
                {
                    y=true;
                    JOptionPane.showMessageDialog(f1,"You are not eligible to Vote\n As you are a minor.","Minor",JOptionPane.WARNING_MESSAGE);
                }
                idchecker(id);
                if(id.length()<10)
                {
                    JOptionPane.showMessageDialog(f1,"Enter Valid Voterid","Error",JOptionPane.WARNING_MESSAGE);
                    f1.dispose();y=true;
                }
                
                }catch(UserException ue)
                {
                    y=true;
                    String sh=ue.toString();
                    JOptionPane.showMessageDialog(f1,sh,"Exception",JOptionPane.WARNING_MESSAGE);
                    j1.setText("");j2.setText("");j3.setText("");
                }
                f1.dispose();
                if(!y)
                {new Castvote();}
            }});

            f1.setVisible(true);f1.setSize(1000,1000);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            super.timer=super.timer+1;
    }
    
    Election(int t) 
    {
               JFrame f2 = new JFrame("Elections");
                f2.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\3.jpg")));
               
                JLabel text=new JLabel("WAIT! ELECTION PROCESS");
                JLabel t1=new JLabel("  IS YET TO BEGIN");
                text.setBounds(200,300,550,60);text.setFont(new Font("Serif",Font.BOLD,40));
                t1.setBounds(250,360,380,60);t1.setFont(new Font("Serif",Font.BOLD,40));t1.setOpaque(true);
                f2.add(t1);f2.add(text);f2.setVisible(true);f2.setSize(1000,1000);text.setOpaque(true);
                f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
    }
   
}
class Castvote extends Demo implements ActionListener
{
    JFrame v=new JFrame("Vote");
    TreeMap<Integer,String> ls=new TreeMap<Integer,String>(new UserComp());
    JLabel l1,l2,l3,l4,l5,l6,l7;JRadioButton c1=new JRadioButton();JRadioButton c2=new JRadioButton();JRadioButton c3=new JRadioButton();JRadioButton c4=new JRadioButton();JRadioButton c5=new JRadioButton();JRadioButton c6=new JRadioButton();JRadioButton c7=new JRadioButton();ButtonGroup bg =new ButtonGroup();
    ImageIcon i1 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\1.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
    ImageIcon i2 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\2.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i3 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\3.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i4 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\4.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i5 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\5.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i6= new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\6.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    ImageIcon i7 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\7.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
    JButton vv=new JButton("VOTE!");
    Castvote()
    {
        
        list=Adselect.ls();
        list.forEach((n)-> ch(n) );int i=1;
        v.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\p1.png")));
        for(Map.Entry<Integer,String> entry :ls.entrySet()) 
        {
            
            String value = entry.getValue();
            Integer n = entry.getKey();
             if(i==1){ l1=new JLabel(value);im(l1,n);l1.setOpaque(true);l1.setFont(new Font("Courier New",Font.BOLD,30));l1.setBounds(40,40,750,55);v.add(l1);c1.setBounds(20,50,20,20);c1.setOpaque(false);bg.add(c1);v.add(c1);}
            else if(i==2){ l2=new JLabel(value);im(l2,n);l2.setOpaque(true);l2.setFont(new Font("Courier New",Font.BOLD,30));l2.setBounds(40,100,750,55);v.add(l2);c2.setBounds(20,120,20,20);c2.setOpaque(false);bg.add(c2);v.add(c2);}
            else if(i==3){ l3=new JLabel(value);im(l3,n);l3.setOpaque(true);l3.setFont(new Font("Courier New",Font.BOLD,30));l3.setBounds(40,160,750,55);v.add(l3);;c3.setBounds(20,180,20,20);c3.setOpaque(false);bg.add(c3);v.add(c3);}
            else if(i==4){ l4=new JLabel(value);im(l4,n);l4.setOpaque(true);l4.setFont(new Font("Courier New",Font.BOLD,30));l4.setBounds(40,220,750,55);v.add(l4);c4.setBounds(20,240,20,20);c4.setOpaque(false);bg.add(c4);v.add(c4);}
            else if(i==5){ l5=new JLabel(value);im(l5,n);l5.setOpaque(true);l5.setFont(new Font("Courier New",Font.BOLD,30));l5.setBounds(40,280,750,55);v.add(l5);c5.setBounds(20,300,20,20);c5.setOpaque(false);bg.add(c5);v.add(c5);}
            else if(i==6){ l6=new JLabel(value);im(l6,n);l6.setOpaque(true);l6.setFont(new Font("Courier New",Font.BOLD,30));l6.setBounds(40,340,750,55);v.add(l6);c6.setBounds(20,360,20,20);c6.setOpaque(false);bg.add(c6);v.add(c6);}
            else if(i==7){ l7=new JLabel(value);im(l7,n);l7.setOpaque(true);l7.setFont(new Font("Courier New",Font.BOLD,30));l7.setBounds(40,400,750,55);v.add(l7);c7.setBounds(20,420,20,20);c7.setOpaque(false);bg.add(c7);v.add(c7);}
            i=i+1;
            System.out.println("start "+n+"->"+value);
        }
        vv.setFont(new Font("Serif",Font.ITALIC,30));vv.setBounds(50,500,140,30);vv.addActionListener(this);
        v.setSize(1000,1000);v.add(vv);
        v.setLayout(null);
        v.setVisible(true);
        super.timer+=1;
    }
    public void actionPerformed(ActionEvent e)
    {
        
        for(Map.Entry<Integer,String> entry :ls.entrySet()) 
        {
            ls1.put(super.x,entry.getKey());
            super.x++;
        }
        if(c1.isSelected()){String i=(ls1.get(1)).toString();vt.put(cnt(1),i);}else if(c2.isSelected()){String i=(ls1.get(2)).toString();vt.put(cnt(2),i);}else if(c3.isSelected()){String i=(ls1.get(3)).toString();vt.put(cnt(3),i);}else if(c4.isSelected()){String i=(ls1.get(4)).toString();vt.put(cnt(4),i);}
        else if(c5.isSelected()){String i=(ls1.get(5)).toString();vt.put(cnt(5),i);}else if(c6.isSelected()){String i=(ls1.get(6)).toString();vt.put(cnt(6),i);}else if(c7.isSelected()){String i=(ls1.get(7)).toString();vt.put(cnt(7),i);}
        v.dispose();
        willdel(vt);
    }
    int cnt(int x){
         switch(x)
        {
            
            case 1: super.x1+=1;return x1;case 2: super.x2+=1;return x2;case 3: super.x3+=1;return x3;
            case 4: super.x4+=1;return x4;case 5: super.x5+=1;return x5;case 6: super.x6+=1;return x6;
            case 7: super.x7+=1;return x7;
        }
        return 0 ;
    }
    void ch(int x)
    {
        
        switch(x)
        {
            
            case 1: ls.put(1,"PSB-Public Soceital Broadway Party ");break;case 2: ls.put(2,"CCI-Contradiction Committee of India");break;case 3: ls.put(3,"MKP-Masdoor Kisaan Party");break;
            case 4: ls.put(4,"ATK-All India Thozhilaali Kazhagam");break;case 5: ls.put(5,"SRF-Surya Raajas Front");break;case 6: ls.put(6,"PVC-Public Voice Committee");break;
            case 7: ls.put(7,"KTP-Karnataka Trinamol Party");break;
        }
    }
    void im(JLabel l ,int x)
    {
        switch(x)
        {
            case 1: l.setIcon(i1);break;case 2: l.setIcon(i2);case 3: l.setIcon(i3);break;case 4: l.setIcon(i4);break;
            case 5: l.setIcon(i5);break;case 6: l.setIcon(i6);break;case 7: l.setIcon(i7);break;
        }
        
    }
    void willdel(TreeMap<Integer,String> ls1)
    {
        for(Map.Entry<Integer,String> entry :ls1.entrySet()) 
        {
            System.out.println(entry.getValue());
        }
    }
}
class Adselect extends Demo implements ActionListener
{
    
    JFrame s=new JFrame("Selection");JLabel l1,l2,l3,l4,l5,l6,l7;JCheckBox c1,c2,c3,c4,c5,c6,c7;
    Adselect()
    {
        System.out.println("In aAD sleect is "+super.timer);
        JButton bt=new JButton("SUBMIT");bt.setBounds(80,500,80,35);bt.addActionListener(this);
        ImageIcon i1 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\1.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
        ImageIcon i2 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\2.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        ImageIcon i3 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\3.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        ImageIcon i4 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\4.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        ImageIcon i5 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\5.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        ImageIcon i6= new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\6.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        ImageIcon i7 = new ImageIcon(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\7.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        s.setContentPane(new JLabel(new ImageIcon("C:\\Users\\A R Kannan\\Desktop\\Maths\\p1.png")));
        l1=new JLabel("PSB-Public Soceital Broadway Party ");l2=new JLabel("CCI-Contradiction Committee of India");l3=new JLabel("MKP-Masdoor Kisaan Party");l4=new JLabel("ATK-All India Thozhilaali Kazhagam");
        l5=new JLabel("SRF-Surya Raajas Front");l6=new JLabel("PVC-Public Voice Committee");l7=new JLabel("KTP-Karnataka Trinamol Party");
        c1=new JCheckBox();c2=new JCheckBox();c3=new JCheckBox();c4=new JCheckBox();c5=new JCheckBox();c6=new JCheckBox();c7=new JCheckBox();
        l1.setIcon(i1);l1.setOpaque(true);l1.setFont(new Font("Courier New",Font.BOLD,30));l2.setIcon(i2);l2.setFont(new Font("Courier New",Font.BOLD,30));
        l3.setIcon(i3);l3.setFont(new Font("Courier New",Font.BOLD,30));l4.setIcon(i4);l4.setFont(new Font("Courier New",Font.BOLD,30));
        l5.setIcon(i5);l5.setFont(new Font("Courier New",Font.BOLD,30));l6.setIcon(i6);l6.setFont(new Font("Courier New",Font.BOLD,30));
        l7.setIcon(i7);l7.setFont(new Font("Courier New",Font.BOLD,30));l2.setForeground(Color.RED);l4.setForeground(Color.RED);l6.setForeground(Color.RED);
        l1.setBounds(40,40,750,55);l2.setBounds(40,100,750,55);l3.setBounds(40,160,750,55);l4.setBounds(40,220,750,55);
        l5.setBounds(40,280,750,55);l6.setBounds(40,340,750,55);l7.setBounds(40,400,750,55);l2.setOpaque(true);l3.setOpaque(true);l4.setOpaque(true);l5.setOpaque(true);l6.setOpaque(true);l7.setOpaque(true);
        c1.setBounds(20,50,20,20);c1.setOpaque(false);c2.setBounds(20,120,20,20);c2.setOpaque(false);c3.setBounds(20,180,20,20);c3.setOpaque(false);
        c4.setBounds(20,240,20,20);c4.setOpaque(false);c5.setBounds(20,300,20,20);c5.setOpaque(false);c6.setBounds(20,360,20,20);c6.setOpaque(false);c7.setBounds(20,420,20,20);c7.setOpaque(false);
        s.setSize(1000,1000);s.add(l1);s.add(l2);s.add(l3);s.add(l4);s.add(l5);s.add(l6);s.add(l7);
        s.add(c1);s.add(c2);s.add(c3);s.add(c4);s.add(c5);s.add(c6);s.add(c7);s.add(bt);
        s.setLayout(null);
        s.setVisible(true);
        super.timer+=1;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(c1.isSelected()){list.add(1);}if(c2.isSelected()){list.add(2);}if(c3.isSelected()){list.add(3);}if(c4.isSelected()){list.add(4);}
        if(c5.isSelected()){list.add(5);}if(c6.isSelected()){list.add(6);}if(c7.isSelected()){list.add(7);}
        s.dispose();
        System.out.println(timer);
    }
    public static ArrayList<Integer> ls()
    {
        return list;
    }
}
class Admin extends Demo implements ActionListener
{
    JTextField tf1;
    
    String pass;final JPasswordField p=new JPasswordField();JFrame j1=new JFrame("Login");
    Admin()
    {
        super.timer=0;
        JLabel l1,l2;JButton b=new JButton("Login");
        l1=new JLabel("User-ID: ");l2=new JLabel("Password: ");
        tf1=new JTextField();
        l1.setBounds(30,40,150,40);tf1.setBounds(100,50,100,20);b.setBounds(100,130,80,20);
        l2.setBounds(30,80,120,40);p.setBounds(100,90,100,20);b.addActionListener(this);
        j1.setSize(400,200);j1.add(l1);j1.add(l2);j1.add(tf1);j1.add(p);j1.add(b);
        j1.setLayout(null);
        j1.setVisible(true);
        super.timer++;
        System.out.println(super.timer);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        String data=new String(p.getPassword());
        String t=tf1.getText();
        if((t!="") && t.length()>=9 )
        {
        if(data.equals("Vote4Growth"))
        {
            j1.dispose();
            new Adselect();
            
        }
        else
        {
            JOptionPane.showMessageDialog(j1,"Invalid password!\n Try Again","Error",JOptionPane.WARNING_MESSAGE);
            p.setText("");
            tf1.setText("");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(j1,"Enter Valid \n UserName","Error",JOptionPane.WARNING_MESSAGE);
            p.setText("");
            tf1.setText("");
        }
        
    }
}
public class Evm {
    public static void main(String[] args) {
        
        new ElectionMC();
    }
}