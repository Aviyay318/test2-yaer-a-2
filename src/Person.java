public class Person {
    private String name;
    private int age;
    private Person[] children;


    public boolean hasChildren(){
        if (this.children!=null&&this.children.length>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean isGrandfather(){
        boolean isGrandfather = false;
        for (int i = 0; i < this.children.length; i++) {
            if (this.children[i].hasChildren()){
                isGrandfather = true;
                break;
            }
        }
        return isGrandfather;
    }
    public boolean addChild(Person child){
        boolean isAdd = false;
        if (this.age - child.age>=18){
            isAdd = true;
            Person [] tempChildren = new Person[this.children.length+1];
            for (int i = 0; i < this.children.length; i++) {
                tempChildren[i] = this.children[i];
            }
            tempChildren[tempChildren.length-1] = child;
            this.children = tempChildren;
        }
        return isAdd;
    }

public Person getYoungestChild(){
        Person youngestChild = null;
        int min = 120;
    for (int i = 0; i < this.children.length; i++) {
        if (min>this.children[i].age){
            min = this.children[i].age;
            youngestChild = this.children[i];
        }
    }
return youngestChild;
}

public  char mostCommonStartingLetter()   {
        String lettersOfNames = this.name.charAt(0)+"";
        if (hasChildren()){
            for (int i = 0; i < this.children.length; i++) {
                lettersOfNames+=this.children[i].name.charAt(0);
                Person child = this.children[i];
                if (child.hasChildren()){
                    for (int j = 0; j < child.children.length; j++) {
                         lettersOfNames+= child.children[j].name.charAt(0);
                    }
                }
            }
        }

     return getMaxChar(lettersOfNames);
}

private char getMaxChar(String str){
        char maxChar=' ';
        int max = 0;
    for (int i = 0; i < str.length(); i++) {
        int count = 0;
        for (int j = i+1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)){
                count++;
            }
        }
        if (count>max){
            max = count;
            maxChar = str.charAt(i);
        }
    }
    return maxChar;
}

public int compareGrandchildren(Person other){
        int meGC = howMuchGrandChildren();
        int otherGc = other.howMuchGrandChildren();
        int result = 0;
        if (meGC>otherGc){
            result = 1;
        }else if (meGC < otherGc){
            result = -1;
        }
        return result;
}

private int howMuchGrandChildren(){
        int count = 0;
  if (hasChildren()){
      for (int i = 0; i < this.children.length; i++) {
        if (this.children[i].hasChildren()){
            count+=this.children[i].children.length;
        }
      }
  }
  return count;
}
}
