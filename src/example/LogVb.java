package example;

import java.util.logging.*;

class LogVb
{private static int deling(int x,int y)
 {return x/y;
 }
 public static void main(String[] argv)
 {try
  {Logger logger = Logger.getLogger("");
   Handler[] handlers = logger.getHandlers();
   System.out.println("aantal:"+handlers.length);
   for (int i=0;i<handlers.length;i++) System.out.println(i+"-"+handlers[i]+"-");
   FileHandler fh = new FileHandler("mijnlog.txt");
   fh.setFormatter(new SimpleFormatter());
   logger.addHandler(fh);
   //logger.setLevel(Level.FINEST);
   logger.setLevel(Level.WARNING);
   logger.log(Level.INFO,"ga iets doen");

   try 
   {System.out.println(deling(5,0));
   } 
   catch (Exception ex) 
   {logger.log(Level.WARNING, "iets mis gelopen", ex);
   } 
   logger.log(Level.FINE,"klaar");
  }
  catch (Exception e){System.err.println("geen logging mogelijk naar file: "+e);}
 }
}
