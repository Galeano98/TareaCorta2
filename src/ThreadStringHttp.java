

public class ThreadStringHttp extends Thread  {
	
	//ThreadStringHttp thread = new ThreadStringHttp();
	
	private ResultMemory tabelResult;
	private String word;
	private NameNodeMemory text;
	
	
	public boolean WordSearch(String Word,ResultMemory tablaResultado){
		
		return tablaResultado.getResult().containsKey(word);
		
	}
	
	public void run(){
		if(!this.WordSearch(this.word, this.tabelResult)){
		   tabelResult.getResult().put(word,text);
		   
		   
		}
		
		
	}

}
	