package Main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
 public class converter {
    public static String[] tensPlace = new String[]{ "", " ten", " twenty"," thirty", " forty", " fifty", " sixty", " seventy", " eighty"," ninety" };
    public static String[] ePlace = new String[]{"ten"," eleven", " twelve", " thirteen", " fourteen", " fifteen"," sixteen", " seventeen", " eighteen", " nineteen" };
    public static String[] iWords = new String[]{"zero", " one", " two"," three"," four", " five", " six", " seven", " eight", " nine"};
    static List<Integer> actnumber = new ArrayList<Integer>(); 
    static ArrayList<String> numReversed = new ArrayList<String>(); 
    static ArrayList<String> inWords = new ArrayList<String>();
    static int j = 0;
    static int i = 0;

    public static void tensComplication() {
        if (actnumber.get(i) == 0)
            inWords.add(j,"");
        else if (actnumber.get(i) == 1)
            inWords.add(j, ePlace[actnumber.get(i-1)]);
        else
            inWords.add(j, tensPlace[actnumber.get(i)]);
    }
    public static String convertAmount(String numericValue,Boolean is_ignorable_taka_if_zero,Boolean is_ignorable_paisa_if_zero) {
    	//double numericValue =(double)d;
    	String[] strValues = new String[2];
    	String taka="";
    	String paisa = "";
    	if(numericValue.contains(".")) {
    		strValues=String.valueOf(numericValue).split("\\.");
    		taka = strValues[0]; 
    		paisa = strValues[1]; 
    	}
    	else {
    		taka =numericValue;
		}
    	
    	Properties bng_to_eng = new Properties();
		Properties eng_to_bng = new Properties();
        eng_to_bng.setProperty("zero", "শূন্য");
        eng_to_bng.setProperty("one", "এক");
        eng_to_bng.setProperty("two", "দুই");
        eng_to_bng.setProperty("three", "তিন");
        eng_to_bng.setProperty("four", "চার");
        eng_to_bng.setProperty("five", "পাঁচ");
        eng_to_bng.setProperty("six", "ছয়");
        eng_to_bng.setProperty("seven", "সাত");
        eng_to_bng.setProperty("eight", "আট");
        eng_to_bng.setProperty("nine", "নয়");
        eng_to_bng.setProperty("ten", "দশ");

        eng_to_bng.setProperty("eleven", "এগার");
        eng_to_bng.setProperty("twelve", "বার");
        eng_to_bng.setProperty("thirteen", "তের");
        eng_to_bng.setProperty("fourteen", "চৌদ্দ");
        eng_to_bng.setProperty("fifteen", "পনের");
        eng_to_bng.setProperty("sixteen", "ষোল");
        eng_to_bng.setProperty("seventeen", "সতেরো");
        eng_to_bng.setProperty("eighteen", "আঠারো");
        eng_to_bng.setProperty("nineteen", "উনিশ");
        eng_to_bng.setProperty("twenty", "বিশ");
        eng_to_bng.setProperty("twenty one", "একুশ");
        eng_to_bng.setProperty("twenty two", "বাইশ");
        eng_to_bng.setProperty("twenty three", "তেইশ");
        eng_to_bng.setProperty("twenty four", "চব্বিশ");
        eng_to_bng.setProperty("twenty five", "পঁচিশ");
        eng_to_bng.setProperty("twenty six", "ছাব্বিশ");
        eng_to_bng.setProperty("twenty seven", "সাতাশ");
        eng_to_bng.setProperty("twenty eight", "আটাশ");
        eng_to_bng.setProperty("twenty nine", "ঊনত্রিশ");

        eng_to_bng.setProperty("thirty", "ত্রিশ");
        eng_to_bng.setProperty("thirty one", "একত্রিশ");
        eng_to_bng.setProperty("thirty two", "বত্রিশ");
        eng_to_bng.setProperty("thirty three", "তেত্রিশ");
        eng_to_bng.setProperty("thirty four", "চৌত্রিশ");
        eng_to_bng.setProperty("thirty five", "পঁয়ত্রিশ");
        eng_to_bng.setProperty("thirty six", "ছত্তিরিশ");
        eng_to_bng.setProperty("thirty seven", "সাইত্রিশ");
        eng_to_bng.setProperty("thirty eight", "আটত্রিশ");
        eng_to_bng.setProperty("thirty nine", "ঊনচল্লিশ");

        eng_to_bng.setProperty("fourty", "চল্লিশ");
        eng_to_bng.setProperty("forty one", "একচল্লিশ");
        eng_to_bng.setProperty("forty two", "বেয়াল্লিশ");
        eng_to_bng.setProperty("forty three", "তেতাল্লিশ");
        eng_to_bng.setProperty("forty four", "চুয়াল্লিশ");
        eng_to_bng.setProperty("forty five", "পঁয়তাল্লিশ");
        eng_to_bng.setProperty("forty six", "ছেচল্লিশ");
        eng_to_bng.setProperty("forty seven", "সাতচল্লিশ");
        eng_to_bng.setProperty("forty eight", "আটচল্লিশ");
        eng_to_bng.setProperty("forty nine", "ঊনপঞ্চাশ");

        eng_to_bng.setProperty("fifty", "পঞ্চাশ");
        eng_to_bng.setProperty("fifty one", "একান্");
        eng_to_bng.setProperty("fifty two", "বায়ান্ন");
        eng_to_bng.setProperty("fifty three", "তেপ্পান্ন");
        eng_to_bng.setProperty("fifty four", "চুয়ান্ন");
        eng_to_bng.setProperty("fifty five", "পঞ্চান্ন");
        eng_to_bng.setProperty("fifty six", "ছাপ্পান্ন");
        eng_to_bng.setProperty("fifty seven", "সাতান্ন");
        eng_to_bng.setProperty("fifty eight", "আটান্ন");
        eng_to_bng.setProperty("fifty nine", "ঊনষাট");

        eng_to_bng.setProperty("sixty", "ষাট");
        eng_to_bng.setProperty("sixty one", "একষট্টি");
        eng_to_bng.setProperty("sixty two", "বাষট্টি");
        eng_to_bng.setProperty("sixty three", "তেষট্টি");
        eng_to_bng.setProperty("sixty four", "চৌষট্টি");
        eng_to_bng.setProperty("sixty five", "পঁয়ষট্টি");
        eng_to_bng.setProperty("sixty six", "ছেষট্টি");
        eng_to_bng.setProperty("sixty seven", "সাতষট্টি");
        eng_to_bng.setProperty("sixty eight", "আটষট্টি");
        eng_to_bng.setProperty("sixty nine", "উনসত্তুর");

        eng_to_bng.setProperty("seventy", "সত্তর");
        eng_to_bng.setProperty("seventy one", "একাত্তর");
        eng_to_bng.setProperty("seventy twi", "বাহাত্তর");
        eng_to_bng.setProperty("seventy three", "তেহাত্তুর");
        eng_to_bng.setProperty("seventy four", "চুয়াত্তর");
        eng_to_bng.setProperty("seventy five", "পচাত্তর");
        eng_to_bng.setProperty("seventy six", "ছিয়াত্তর");
        eng_to_bng.setProperty("seventy seven", "সাতাত্তর");
        eng_to_bng.setProperty("seventy eight", "আটাত্তর");
        eng_to_bng.setProperty("seventy nine", "উনাশি");

        eng_to_bng.setProperty("eighty", "আশি");
        eng_to_bng.setProperty("eighty one", "একাশি");
        eng_to_bng.setProperty("eighty two", "বিরাশি");
        eng_to_bng.setProperty("eighty three", "তিরাশি");
        eng_to_bng.setProperty("eighty four", "চুরাশি");
        eng_to_bng.setProperty("eighty five", "পঁচাশি");
        eng_to_bng.setProperty("eighty six", "ছিয়াশি");
        eng_to_bng.setProperty("eighty seven", "সাতাশি");
        eng_to_bng.setProperty("eighty eight", "অষ্টআশি");
        eng_to_bng.setProperty("eighty nine", "ঊনানব্বুই");

        eng_to_bng.setProperty("ninety", "নব্বই");
        eng_to_bng.setProperty("ninety one", "একানব্বই");
        eng_to_bng.setProperty("ninety two", "বিরানব্বই");
        eng_to_bng.setProperty("ninety three", "তিরানব্বই");
        eng_to_bng.setProperty("ninety four", "চুরানব্বই");
        eng_to_bng.setProperty("ninety five", "পঁচানব্বই");
        eng_to_bng.setProperty("ninety six", "ছিয়ানব্বই");
        eng_to_bng.setProperty("ninety seven", "সাতানব্বই");
        eng_to_bng.setProperty("ninety eight", "আটানব্বই");
        eng_to_bng.setProperty("ninety nine", "নিরানব্বই");

        eng_to_bng.setProperty("","");
        bng_to_eng.setProperty("শূন্য", "zero");

        bng_to_eng.setProperty("শত", "hundred");
        bng_to_eng.setProperty("হাজার", "thousand");
        bng_to_eng.setProperty("লক্ষ","lakh");
        bng_to_eng.setProperty("কোটি","crore");

        bng_to_eng.setProperty("টাকা","taka");
        bng_to_eng.setProperty("শূন্য টাকা","zero taka");

        bng_to_eng.setProperty("শূন্য পয়সা মাত্র", "zero paisa only");
        bng_to_eng.setProperty("এবং","and");
        bng_to_eng.setProperty("পয়সা মাত্র", "paisa only");
        bng_to_eng.setProperty("মাত্র", "only");
        if (((paisa).length()) > 2)
        	paisa =(paisa).substring(0,2);
        if (((paisa).length()) == 1) {
        	String str_paisa =(paisa);
            str_paisa += '0';
            paisa = str_paisa;
            }
        if (((paisa).length()) == 2 && (paisa).startsWith("0")) {
        	String s_paisa = (paisa);
            s_paisa = s_paisa.substring(1,2);
            paisa = s_paisa;
        }
        String tk_in_word = convert(taka);
        actnumber = new ArrayList<Integer>(); 
        numReversed = new ArrayList<String>(); 
        inWords = new ArrayList<String>();
         j = 0;
         i = 0;
        String paisa_in_word = convert(paisa);
        String taka_in_word = "";

        if (tk_in_word != "" && tk_in_word != "zero")
        	taka_in_word = tk_in_word + " /টাকা/";
        else if(paisa_in_word=="zero") taka_in_word = "শূন্য টাকা/ ";
        else taka_in_word="";
        if (is_ignorable_taka_if_zero == false && tk_in_word == null) {
        	taka_in_word = "";
        }
        if ((is_ignorable_taka_if_zero == false || taka_in_word != "") && ((paisa_in_word) != "zero" || is_ignorable_paisa_if_zero == false)&& tk_in_word != "zero") {
        	taka_in_word += "এবং/";
        }
        if ((paisa_in_word) != "zero") {
            paisa_in_word = paisa_in_word + "/পয়সা মাত্র";
        }
        else if (is_ignorable_paisa_if_zero== false && paisa_in_word =="zero") {
            paisa_in_word = "শূন্য পয়সা মাত্র";
        }
        else {
            paisa_in_word = "মাত্র";
        }
        String amountInWord = taka_in_word + paisa_in_word;

        String[] splited = amountInWord.split("/");


        String final_amount_inword = " ";
        for (int x=0;x<splited.length;x++) {
                //if lng == 'bng':
        	        String temp=splited[x];
        	        String temp2=eng_to_bng.getProperty(temp.trim());
        	        if(temp2!=null){
                    final_amount_inword +=" "+temp2;
        	        }else
        	        	final_amount_inword +=" "+temp;
                    //final_amount_inword += " " + bng_to_eng[w]
        }
//            except Exception as e:
//                final_amount_inword += " " + w

        return final_amount_inword;
    }
	public static String convert(String numericValue) {
        if (numericValue.length() == 0 || numericValue.matches("^[0]")== true) {
            return "zero";
        }
        String temp = numericValue;
        int[] numArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
        	numArray[i] = temp.charAt(i) - '0';
        }
        int[] numReversed = new int[numArray.length];
        for(int y = 0,x=numArray.length-1; x>=0; x--,y++){
        		numReversed[y] = numArray[x];
        	 }
        for (int i = 0; i < numReversed.length; i++) {
        	actnumber.add(Integer.valueOf(numReversed[i]));
		}
      
        //int x =actnumber.length+1;
        actnumber.add(0);
        actnumber.add(0);

        if (numericValue.matches("") || numericValue.matches("0") ||numericValue.matches("00")||numericValue.matches("000")||numericValue.matches("0000")||numericValue.matches("00000")||numericValue.matches("000000")||numericValue.matches("0000000")||numericValue.matches("00000000")||numericValue.matches("000000000")||numericValue.matches("0000000000")||numericValue.matches("00000000000")||numericValue.matches("000000000000")||numericValue.matches("0000000000000")||numericValue.matches("00000000000000")||numericValue.matches("000000000000000")||numericValue.matches("0000000000000000")||numericValue.matches("0000000000000000")||numericValue.matches("00000000000000000")||numericValue.matches("000000000000000000")||numericValue.matches("0000000000000000000")||numericValue.matches("00000000000000000000")||numericValue.matches("000000000000000000000")||numericValue.matches("0000000000000000000000")||numericValue.matches("00000000000000000000000")||numericValue.matches("000000000000000000000000")||numericValue.matches("0000000000000000000000000")) 
        {
            return "zero";
        }

        int arr_length = numArray.length;
        String finalWord = "";
        String inWord = "";
        for (int c = arr_length;c>=0;c--) {
	            if (i == 0) {
	                inWord = "";
	                if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1) {
	                	inWord="";
	                	}
	                else
	                     inWord+=(iWords[(actnumber.get(i))]);
	                inWords.add(j, inWord +"");
	            }
	            if (i == 1) {
	            	if (actnumber.get(i) == 0) {
	                    inWords.add(j,"");
	            	}
	                tensComplication();
	            }
	            if (i == 2) {
	                if (actnumber.get(i) == 0) {
	                    inWords.add(j,"");
	                }
	                else if (actnumber.get(i - 1) != 0 && actnumber.get(i - 2) != 0)
	                    inWords.add(j, iWords[actnumber.get(i)] + " /শত/");
	                else
	                    inWords.add(j, iWords[actnumber.get(i)] + " /শত/");
	            }
	            if (i == 3) {
	            	inWord = "";
	                    if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1) {
	                    	inWord = "";
	                    }
	                    else
	                        inWord+=(iWords[(actnumber.get(i))]);
	
	                    if (actnumber.get(i + 1) != 0 || actnumber.get(i) > 0)
	                        inWords.add(j, inWord +" /হাজার/");
	                    else inWords.add(j,"");

	            }
	            if (i == 4) {
	            	if (actnumber.get(i) == 0) {
	                    inWords.add(j,"");
	            	}
	                tensComplication();
	            }
	            if (i == 5){
	            	inWord = "";
	                    if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1) {
	                    	inWord = "";
	                    }
	                    else
	                        inWord+=(iWords[(actnumber.get(i))]);
	
	                    if (actnumber.get(i + 1) != 0 || actnumber.get(i) > 0)
	                        inWords.add(j, inWord + " /লক্ষ/");
	                    else inWords.add(j,"");
	            }
	            if (i == 6){
	            	if (actnumber.get(i) == 0) {
	                    inWords.add(j,"");
	            	}
	                tensComplication();
	            }
	
	            if (i == 7){
	                	inWord = "";
	                    if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1) {
	                    	inWord = "";
	                    }
	                    else
	                        inWord+=(iWords[(actnumber.get(i))]);
	
	                    if (actnumber.get(i + 1) != 0 || actnumber.get(i) > 0)
	                        inWords.add(j,inWord + " /কোটি/");
	                    else if (numericValue.length()>7) {
	                    	inWords.add(j, " /কোটি/");
						}
	                    else inWords.add(j,"");
	            }
	            if (i == 8){
	            	if (actnumber.get(i) == 0)
	                    inWords.add(j,"");
	                tensComplication();
	            }
	
	            if (i == 9) {
	                if (actnumber.get(i) == 0)
	                    inWords.add(j,"");
	                else if (actnumber.get(i - 1) != 0 && actnumber.get(i - 2) != 0)
	                    inWords.add(j, iWords[actnumber.get(i)] + " /শত/");
	                else
	                    inWords.add(j, iWords[actnumber.get(i)] + " /শত/");
	            }
	            if (i == 10){
	                	inWord = "";
	                    if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1)
	                    	inWord = "";
	                    else
	                        inWord+=(iWords[(actnumber.get(i))]);
	
	                    if (actnumber.get(i + 1) != 0 || actnumber.get(i) > 0)
	                        inWords.add(j, inWord + " /হাজার/");
	                    else inWords.add(j,"");
	            }
	
	            if (i == 11){
	            	if (actnumber.get(i) == 0)
	                    inWords.add(j,"");
	                tensComplication();
	            }
	            if (i == 12){
	                	inWord = "";
	                    if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1)
	                    	inWord = "";
	                    else
	                        inWord+=(iWords[(actnumber.get(i))]);
	
	                    if (actnumber.get(i + 1) != 0 || actnumber.get(i) > 0)
	                        inWords.add(j, inWord + " /লক্ষ/");
	                    else inWords.add(j,"");
	            }
	
	            if (i == 13){
	            	if (actnumber.get(i) == 0)
	                    inWords.add(j,"");
	                tensComplication();
	            }
	            if (i == 14){
	                	inWord = "";
	                    if (actnumber.get(i) == 0 || actnumber.get(i + 1) == 1)
	                    	inWord = "";
	                    else
	                        inWord+=(iWords[(actnumber.get(i))]);
	
	                    if (actnumber.get(i + 1) != 0 || actnumber.get(i) > 0)
	                        inWords.add(j, inWord + " /কোটি/");
	                    else inWords.add(j,"");
	            }
	            if (i == 15){
	            	if (actnumber.get(i) == 0)
	                    inWords.add(j,"");
	                tensComplication();
	            	}
	            j += 1;
	            i += 1;
            	}
            int k = 0;
            Collections.reverse(inWords);
            for (String s : inWords)
            {
            	finalWord += s;
            }
        return finalWord;
   }
	public static void main(String[] args) {

		System.out.println(convertAmount("10000000000099",true,true));
	}
}
