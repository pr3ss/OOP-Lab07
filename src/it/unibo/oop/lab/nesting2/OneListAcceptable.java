package it.unibo.oop.lab.nesting2;


import java.util.List;

public class OneListAcceptable <T> implements Acceptable<T>{

	private  List<T> lista ;
	
	
	public OneListAcceptable(List<T> list) {
		this.lista = list;
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			
			private int count=0;
			
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(!lista.contains(newElement) ) {
					throw new ElementNotAcceptedException(newElement);
				}
				count++;
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(count!=lista.size()) {
					throw new EndNotAcceptedException();
				}
				
			}};
	}

}
