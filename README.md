* Tipos curinga (wildcard types) 
	http://educandoweb.com.br
	Prof. Dr. Nelio Alves



* Generics são invariantes

	List<Object> não é o supertipo de qualquer tipo de lista:

	List<Object> myObjs = new ArrayList<Object>();
	List<Integer> myNumbers = new ArrayList<Integer>();
	myObjs = myNumbers; // erro de compilação


* O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:

	List<?> myObjs = new ArrayList<Object>();
	List<Integer> myNumbers = new ArrayList<Integer>();
	myObjs = myNumbers;