package depInjconstructor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;  
	private String name;  
	//private List<Answer> answers;  
	private Map<String,String> answers;
	  
	public Question() {}  
	
//	public Question(int id, String name, List<Answer> answers) {  
//	    super();  
//	    this.id = id;  
//	    this.name = name;  
//	    this.answers = answers;  
//	}  
	
//	public void displayInfo(){  
//    System.out.println(id+" "+name);  
//    System.out.println("answers are:");  
//    Iterator<Answer> itr=answers.iterator();  
//    while(itr.hasNext()){  
//        System.out.println(itr.next());  
//    }  
//}
	
	public Question(int id, String name, Map<String, String> answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }  
	}  
	  

}
