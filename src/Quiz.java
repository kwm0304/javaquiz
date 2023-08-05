import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
    //initializing vars
    String[] questions = {
    "What does object-oriented programming mean?",
          "What is the difference between classes and objects?",
            "What does polymorphism mean?",
            "The _____ class is a special class in Java which is the root class from which all other classes inherit, either directly or indirectly.",
            " The _____ method returns a copy of this object.",
            "The _____ method returns a Class object that represents this object's runtime class",
            "The _____ method returns a String representation of this object.",
            "The _____ class represents all possible objects that can be thrown by a throw statement and caught by a catch clause in a try..catch statement.",
            "Subclasses of the class Exception which are not subclasses of ______ are checked exceptions.",
            "If an error is predicatble but unpreventable and reasonable to recover from, a checked exception should be used",
            "Since Java has exception handling capability, programmers do not need to write code to handle exceptions.",
            "Which is not a feature of stack memory:",
            "Access to stack memory can be described as..",
            "When a method is finished executing, which of the following does not happen with the stack?",
            "Which of the following is not true about heap space?",
            "Which is not a feature of heap memory?",
            "Which is not a rule for which you can create a custom class in Java?",
            "Custom classes can't b created in Java since Java is not object-oriented",
            "Custom classes are more flexible than the built-in Java language",
            "Garbage collection can be forced by..",
            "Variable references are stored in the stack",
            "What is the easiest way to immediately force garbage collection?",
            "A Java programming language developer must write memory management into their programs",
            "Which is not a consideration when selecting an OS to use for development?",
            "Which is NOT an advantage for developing code in a GNU/Linux environment?",
            "Which is NOT an advantage for developing code in a macOS environment?",
            "Which is NOT an advantage for developing code in a Windows environment?",
            "_____ refers to the entire depth of a computer application.",
            "____refers to everything the client can see and interact with.",
            "____refers to all the servers, databases, and other internal architecture that drives the application.",
            "Which is not a front end platform?",
            "Which of the following is a reason for selecting the Java programming language?",
            "Which two constructs characterize an object-oriented programming language?",
            "The best definition of an object-oriented class is",
            "The best definition of an object is",
            "The Java source code file is passed through the compiler, which then encodes the source code into a machine-independent encoding known as _____",
            "The ______ translates the high-level language instructions into object code.",
            "What is WORA?",
            "With respect to Java source code...",
            "The code for each JRE is created using a",
            "What is compile time?",
            "Which is a benefit of a \"Hello, World!\" program?",
            "Why would an experienced programmer use a \"Hello, World!\" program?",
            "A method is...?",
            "Java requires that when a variable is declared, that the data type of the variable also needs to be declared. This makes Java a...?",
            "What is the difference between a primitive and a reference variable?",
            "What is the size of an int variable?",
            "What is the default type of variable used for decimals?",
            "Which is not a type of operator in the Java programming language?",
            "If an int variable x equals 5, and the next statement is int y = x++, which of the following occurs first?",
            "If an int variable x equals 5, and the next statement is int y = ++x, which of the following occurs first?",
            "Which of the following has the highest operator precdence, meaning that operators of this type will be executed first?",
            "From which of the following classes can you create an object without the new operator?",
            "When comparing Strings, the == operator will compare ____ ?",
            "What will be printed after the last line of this block of Java code? String str1 = \"my string\"; str1.concat(\" is the best!\"); System.out.println(str1);",
            "Which is NOT a reason for using the break statement",
            "A break statement...",
            "The main difference between a break and a continue statement is...",
            "A continue statement...",
            "Which type of loop is most appropriate for executing a specific number of times?",
            "Which type of loop may not execute its code at all?",
            "Which type of loop will run its code at least once?",
            "Loops rely on what type of expression to tell it to stop looping?",
            "Grace Hopper is credited with discovering the first computer bug when a _____ got stuck between relay contacts in the Harvard Mark II computer.",
            "The Internet should never be used to find debugging solutions.",
            "Repeatedly dividing the code into halves and commenting out one half to find an error is known as the _____ method of debugging.",
            " _____ is a process that helps people identify issues or problems occurring in a system.",
            "_____ is a troubleshooting technique where you get more info on the specifications, configuration setup, and events that occurred.",
            "Troubleshooting occurs at a lower level than debugging.",
            "Troubleshooting can be applied to any system.",
            "Each JVM thread (a path of execution) is associated with a _____ that's created when the thread is created.",
            "A new _____ is created each time a method is called.",
            "A _____ is a report of the active stack frames at a certain point in time during a thread's execution.",
            "In Java there are three methods to print exception information. All of them are present in the _____ class.",
            "All of the following are found in a package except?",
            "All of the following are advantages of packages except:",
            "If a variable is declared as private , then it can be used in _______.",
            "which package is imported implicitly?",
            "Whenever you perform a mathematical operation on two values that aren't of the same type, Java automatically converts one of them to the type of the other. If one of the values is a double, the other value is...?",
            "Whenever you perform a mathematical operation on two values that aren't of the same type, Java automatically converts one of them to the type of the other. If neither is a double but one is a float, the other is...?",
            "Whenever you perform a mathematical operation on two values that aren't of the same type, Java automatically converts one of them to the type of the other. If neither is a <b>double</b> nor a float but one is a <b>long</b>, the other is...?",
            "A class is...?",
            "A method is...?",
            "An object is...?",
            "A reference variable is...?",
            "One advantage of using object-oriented programming is...?",
            "How many arguments are there in a default constructor?",
            "What differentiates a constructor and a method?",
            "Apart from instantiation what are constructors used for?",
            "What keyword refers to the object being instantiated?",
            "What is the correct name for the wrapper class for the int type?",
            "What is the process of converting a primitive to its wrapper class?",
            "What is the process of converting a wrapper class to its primitive?",
            "What is the Java process that implicitly converts a primitive to its wrapper class?",
            "Which of these implements the List interface?",
            "Which of these is NOT a characteristic of the List interface?",
            "Which of these is not an additional operation provided by the List interface?",
            "Which of these is not an additional operation provided by the List interface?",
            "If an exception is NOT handled anywhere in the program, what will occur?",
            "Exception handling is done via...?",
            "\"Ducking\" or declaring an exception is done with which keyword?",
            "Code that executes at the end of a try-catch block is designated with which keyword?",
            "Custom exceptions in Java...?",
            "When extending the RuntimeException class in Java, what is created?",
            "If you want to require your custom exception to be handled...?",
            "Why would we want to extend the RuntimeException class?",
            "Select the false statement regarding inheritance",
            "Which of the following is not a good example of a hierarchy likely to be modeled by inheritance?",
            "____ is a type of inheritance where there is one Parent class and one Child class. One child class extends one parent class.",
            "____ is a type of inheritance where there is one super class and more than one sub class extend the super class.",
    };

    String[][] options = {
            {"Programming constructs are objects which model real-world concepts and can be put into hierarchies, and the relationship between objects are managed", "Functions are first-class objects and can be passed as parameters","Variables are statically typed and not allowed to change types once declared", "Any piece of software which operates at an enterprise-level scale"},
            {"Classes are read-only, objects are dynamic","Objects are the templates from which classes are instantiated", "Classes are the templates from which objects are instantiated", "Classes are dynamic, objects are read-only"},
            {"Hiding implementation details through a higher-level construct, like abstract classes and interfaces, thereby decreasing coupling and increasing cohesion", "Restricting access to data members by using access modifiers and getter/setter methods", "Receiving state and behavior from other classes, thereby reducing boilerplate and duplicate code and allowing for hierarchies of classes", "Allowing the implementation of a given behavior to vary, whether between subclasses or within the same class"},
            {"Object", "Base", "Root", "Fundamental"},
            {"clone", "getClass", "toString", "finalize"},
            {"clone", "getClass", "toString", "finalize"},
            {"clone", "getClass", "toString", "finalize"},
            {"Throwable"," ExceptionHandler"," ErrorHandler","Catchable"},
            {"RuntimeException","IOException", "ArithmeticException", "NullPointerException"},
            
    };
    //constructor
    public Quiz() {

    }
    public void nextQuestion() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void displayAnswer() {

    }

    public void results() {

    }
}
