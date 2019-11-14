
package dosyaişlemlerideneme;
import java.io.*;
import java.util.*;
public class Dosyaişlemlerideneme {
    
   
    public static void main(String[] args) {
        
       // DOSYAYA YAZMA
       /*
        String cumle = "Bugün hava cok guzel.";
        try{
            FileOutputStream f  = new FileOutputStream("dosya.txt",true);
            PrintStream yaz = new PrintStream(f);
            yaz.println(cumle);
            yaz.println("\"Her seçiş bir vazgeçiştir.\"");
            yaz.print("Jean Paul Sartre");
        }
        catch(IOException e){
            
        }
        */
       
/*-----------------------------------------------------------------------------------------------------------------------------------*/    
/*-----------------------------------------------------------------------------------------------------------------------------------*/  

       //  DOSYADAN SATIR SATIR OKUMA
       /*
       try{ //  TRY-CATCH OLMAYINCA HATA VERİYOR BURDA
           FileInputStream fi = new FileInputStream("dosya.txt");
           BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
           String satir;
           while((satir = buf.readLine()) != null){
               System.out.println(satir);
           }
       }
               catch(FileNotFoundException f)       
        {System.out.println("dosya yok");}
          catch(IOException ioex)
          {System.out.println("başka bir hata oldu"); }
    */
       
/*-----------------------------------------------------------------------------------------------------------------------------------*/    
/*-----------------------------------------------------------------------------------------------------------------------------------*/ 
    
       // DOSYADAN HARF HARF OKUMA
       /*
        StringBuffer icerik = new StringBuffer("");
        try{
            File f=new File("dosya.txt");
            FileInputStream fi=new FileInputStream(f);
            int k;
            while ((k=fi.read())!=-1){
       //append dosyadakileri silmeden sonuna eklemek
            icerik.append((char)k);     // harfleri bir stringde birleşitiriyoruz,, sonra icerik stringini istediğimiz yerde yzdırabilriz
           // System.out.print((char)k);  // bu şekilde yazarsakda olur,, aşşağıda icerik  stringine ihtiyacımız kalmaz;
           // System.out.println((char)k);  // bu şekilde yazarsak harfleri tek tek  basar;
            }
        
        }
        catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
          catch(IOException ioex)
          {System.out.println("başka bir hata oldu"); }
        //--
           System.out.println("icerik :");
           System.out.println(icerik);
    */      
       
/*-----------------------------------------------------------------------------------------------------------------------------------*/    
/*-----------------------------------------------------------------------------------------------------------------------------------*/ 
       
       //  DOSYADAN KELİME KELİME OKUMA
       //  import java.util.*; -->  ekstradan bu kütüphane de lazım  StringTokenizer  için
       /*
       try{
           FileInputStream fi=new FileInputStream("dosya.txt");
            BufferedReader buf=new BufferedReader(new InputStreamReader(fi));
            String satir;
            StringTokenizer st;
            while ((satir=buf.readLine())!=null){
                st=new StringTokenizer(satir);      // satır satır alır
                while (st.hasMoreTokens()){     // bunu eklemezsek sadece her satırın ilk kelimesini yazar,,, bu fonksiyon st de daha fazla kelime varmı diye sorar
                   System.out.println(st.nextToken());   }      // snextToken()  satırımızdaki sıradaki kelimeye geçer
            }
                
            }
        catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
          catch(IOException ioex)
          {System.out.println("başka bir hata oldu"); }
         */

/*-----------------------------------------------------------------------------------------------------------------------------------*/    
/*-----------------------------------------------------------------------------------------------------------------------------------*/ 


       
       
    }
    
}
