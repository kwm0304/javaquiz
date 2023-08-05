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
            "The _____ method returns a copy of this object.",
            "The _____ method returns a Class object that represents this object's runtime class",
            "The _____ method returns a String representation of this object.",
            "The _____ class represents all possible objects that can be thrown by a throw statement and caught by a catch clause in a try..catch statement.",
            "Subclasses of the class Exception which are not subclasses of ______ are checked exceptions.",
            "If an error is predictable but unpreventable and reasonable to recover from, a checked exception should be used",
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
            {"True", "False"},
            {"False", "True"},
            {"If the memory is full, the program proceeds as normal", "It grows and shrinks as new methods are called and returned, respectively", "Variables inside the stack exist only as long as the method that created them is running", "It's automatically allocated and deallocated when the method finishes execution"},
            {"First In First Out", "Last In First Out", "Random access to some elements in the stack", "Full access to all elements in the stack"},
            {"The flow goes back to the calling method", "It's corresponding stack frame is flushed", "The memory is allocated for the stack is lost until the machine resets", "Space becomes available for the next method"},
            {"Heap space is used for the dynamic memory allocation of Java objects and JRE classes at runtime", "New objects are always created in the heap space", "References to objects in heap space are stored in stack memory", "Heap space uses static memory allocation"},
            {"If heap space is full, Java throws java.lang.OutOfMemoryError", "This memory, in contrast to stack, isn't automatically deallocated", "Unlike stack, a heap isn't threadsafe and needs to be guarded by properly synchronizing the code..", "Access to this memory is faster compared to stack memory"},
            {"Syntax rules", "Validation rules", "Mapping rules", "Processing rules"},
            {"False", "True"},
            {"True", "False"},
            {"Using System.gc() method", "Calling the finalize() method", "It can never be forced", "None of these"},
            {"True", "False"},
            {"Call System.gc() in the code", "Invoke a Java heap dump", "Use the Java diagnostic command and run jcmd GC.run", "You cannot force garbage collection"},
            {"False", "True"},
            {"Marketing of the final product", "Speed", "Platforms for the final product (local machine, clout, etc.)", "Learning curve"},
            {"GNU/Linux offers a wide range of hardware compatibility with external peripherals", "GNU/Linux is open source", "GNU/Linux is stable and secure", "GNU/Linux consumes less computer resources than other operating systems"},
            {"macOS is less expensive than Windows or GNU/Linux when considering hardware/software costs"," macOS offers a clean and intuitive user interface", "macOS is built on multitasking", "Compared to Windows, macOS is less vulnerable to security issues such as malware"},
            {"Windows updates rarely hinder the performance of software developed under the previous version"," Windows offers free access to high quality development software"," Windows has the largest installed consumer base of all the operating systems", " Compared to macOS, Windows is less expensive to implement"},
            {"Fullstack", "Front end", "Back end", "Client side"},
            {"Fullstack", "Front end", "Back end", "Client side"},
            {"Fullstack", "Front end", "Back end", "Client side"},
            {"HTML", "CSS", "Server software", "Javascript"},
            {"Automatic memory management" ,"Limited open-source community", "Platform-dependent", "Limited built-in runtime library"},
            {"Variables and loops", "Classes and objects",  "Compilers and linkers", "Integers and floating-point numbers"},
            {"A state", "A behavior", "A blueprint for creating objects", "A method"},
            {"A blueprint for creating a class", "A field", "An instance of a class definition", "A method"},
            {"bytecode", "bitcode", "hexcode", "octalcode"},
            {"compiler", "linker", "assembler", "editor"},
            {"Write Once, Run Anywhere", "Write Once, Read Anywhere", "Write Over, Read Access", "Write On, Read At"},
            {"It can be run on any machine without any extra software", "It can be run on any machine that has a JRE/JVM", "It has to be rewritten for every different type of machine", "It can be run on another machine but the programmer needs to create a virtual machine first."},
            {"A text editor", "A virtual machine", "A Just In Time Compiler", "A web browser"},
            {"When source code is converted to byte code", "When the JDK is installed", "When the JVM is running the program", "When the programmer writes the object code"},
            {"It serves as an introduction to programming", "It is a lengthy program that will test out all aspects of a programming language", "It requires detailed knowledge of a programming language's syntax", "It provides a rigorous test of a machine's resources"},
            {"An experienced programmer would never use such a simple program.", "To test that all components of a new programming language were installed properly.", "To test a new sound card.", "To create a new Notepad program for Windows."},
            {"A template used to instantiate objects", "A block of reusable code", "An instance of a class in memory", "A variable that stores the reference to an object in memory"},
            {"Strongly typed language", "Obsolete language", "Weakly typed language", "Object Oriented language"},
            {"A primitive variable stores a value, a reference variable stores the memory address of an object", "A primitive variable stores a value, a reference variable stores an object", "A primitive variable stores the memory address of a value, a reference variable stores the memory address of an object", "There is no difference"},
            {"32 bits (4 bytes)", "8 bits (1 byte)", "16 bits (2 bytes)", "64 bits (8 bytes)"},
            {"double", "float", "int", "real"},
            {"Semantic", "Assignment", "Increment", "Ternary"},
            {"x is increased by 1", "y is set equal to 5", "y is increased by 1", "A runtime error occurs"},
            {"x is increased by 1", "y is set equal to 5", "y is increased by 1", "A runtime error occurs"},
            {"multiplicative", "postfix", "additive", "bitwise"},
            {"StringBuffer", "String", "StringBuilder", "StringList"},
            {"Complete string contents", "First characters of the Strings only", "Sizes of the strings", "Memory addresses"},
            {"my string", "MY STRING IS THE BEST!", "my string is the best!", "nothing; compiler error"},
            {"To allow normal program flow", "To exit a loop", "To terminate a sequence in a switch statement", "To implement a 'goto' statement"},
            {"Can be used with or without a label", "Must be used with a label", "Must be used without a label", "Should never be used"},
            {"A continue directs program flow to the next loop iteration, a break immediately directs program flow out of the loop.", "A break directs program flow to the next loop iteration, a continue immediately directs program flow out of the loop.", "There is no difference between the two.", "A break is only used with switch statements."},
            {"Can be used with or without a label", "Must be used with a label", "Must be used without a label", "Should never be used"},
            {"for loop", "while loop", "do-while loop", "recursive loop"},
            {"for loop", "while loop", "do-while loop", "recursive loop"},
            {"spaghetti code", "while loop", "do-while loop", "recursive loop"},
            {"Assignment", "Casting", "Switch", "Conditional"},
            {"moth", "ant", "spider", "cricket"},
            {"False", "True"},
            {"Binary search", "Trial and error", "Recursive", "Automated testing"},
            {"Troubleshooting", "Brainstorming", "Delegating", "Transference"},
            {"Drilling down", "Bottom-up", "Horizontal", "Random"},
            {"False", "True"},
            {"True", "False"},
            {"stack", "queue", "heap", "array"},
            {"frame", "stack", "queue", "heap"},
            {"stack trace", "queue trace", "heap trace", "memory dump trace"},
            {"Throwable", "Arithmetic", "Abstract", "Catchable"},
            {"User input", "classes", "interfaces", "enums"},
            {"Packages create more disorganization.", "Packages enable you to keep your classes separate from the classes in the Java API.", "Packages allow you to reuse classes in other applications.", "Packages allow you to distribute your classes to others."},
            {"Any class of any package", "Any class of same package", "Only a subclass in that package", "Only in the same class"},
            {"java.applet", "java.util", "java.lang", "java.io"},
            {"Converted to a double", "Converted to a float", "Converted to an int", "Converted to a long"},
            {"Converted to a double", "Converted to a float", "Converted to an int", "Converted to a long"},
            {"Converted to a double", "Converted to a float", "Converted to an int", "Converted to a long"},
            {"A template used to instantiate objects", "An executable element inside of a class", "An instance of a class in memory", "A variable that stores the reference to an object in memory"},
            {"A template used to instantiate objects", "An executable element inside of a class", "An instance of a class in memory", "A variable that stores the reference to an object in memory"},
            {"A template used to instantiate objects", "An executable element inside of a class", "An instance of a class in memory", "A variable that stores the reference to an object in memory"},
            {"A template used to instantiate objects", "An executable element inside of a class", "An instance of a class in memory", "A variable that stores the reference to an object in memory"},
            {"There are no advantages to OOP", "All the code must be revised every time one class is modified", "OOP is sequential, and classes must be developed in a specific order", "Classes can be developed independently of each other"},
            {"0", "1", "2", "3"},
            {"methods have no access modifier", "constructors have no return type", "methods have no return type", "constructors have no access modifier"},
            {"initializing object lifecycle", "set object behavior", "set object scope", "initializing object state"},
            {"int", "case", "this", "for"},
            {"Integer", "int", "integer", "Int"},
            {"Boxing", "Unboxing", "Wrapping", "Unwrapping"},
            {"Boxing", "Unboxing", "Wrapping", "Unwrapping"},
            {"Autoboxing", "Boxing", "Wrapping", "Unwrapping"},
            {"ArrayList", "Set", "Queue", "Heap"},
            {"It does not preserve the order in which elements are inserted.", "Duplicate entries are allowed.", "Elements are accessed by index", "List inherits operations from Collections as well as adding some of its own."},
            {"eliminate()", "get()", "set()", "addAll()"},
            {"firstIndexOf()", "indexOf()", "lastIndexOf()", "remove()"},
            {"The exception propagates up through the call stack until it is handled by the JVM which will then terminate the program.", "The computer's operating system will handle the exception.","The compiler will correct the code before it finishes compiling.", "Nothing occurs."},
            {"A try-catch block", "An if-then block", "A for loop", "A do-while block"},
            {"throws", "try", "catch", "if"},
            {"finally", "try", "catch", "throws"},
            {"Can be created by extending any exception class", "Can only be created by extending certain exception classes", "Can be created by creating a whole new exception class", "Cannot be created"},
            {"An unchecked exception", "A checked exception", "No new exceptions", "A hybrid exception"},
            {"Extend any existing exception class", "Do not extend an existing exception class", "Create your own exception class", "Extend any class but the Exception class"},
            {"So that we write the code that handles the exception", "To let the JVM handle the exception", "To let the computer operating system to handle the exception", "Do not extend the RuntimeException class or it will create more exceptions"},
            {"Base classes are usually more specific than derived classes.", "A derived class can be the base class for other derived classes.", "A derived class can contain more attributes and behaviors than its base class", "Some derived classes can have multiple base classes."},
            {"Prime numbers", "Airplanes", "Animals", "Geometric shapes"},
            {"Single inheritance", "Multilevel inheritance", "Hierarchical inheritance", "Multiple inheritance"},
            {"Single inheritance", "Multilevel inheritance", "Hierarchical inheritance", "Multiple inheritance"}
    };

    String[] answers = {
            "Programming constructs are objects which model real-world concepts and can be put into hierarchies, and the relationship between objects are managed",
            "Classes are the templates from which objects are instantiated",
            "Allowing the implementation of a given behavior to vary, whether between subclasses or within the same class",
            "Object",
            "clone",
            "getClass",
            "toString",
            "Throwable",
            "RunTimeException",
            "True",
            "False",
            "If the memory is full, the program proceeds as normal",
            "Last In First Out",
            "The memory is allocated for the stack is lost until the machine resets",
            "Heap space uses static memory allocation",
            "Access to this memory is faster compared to stack memory",
            "Syntax rules",
            "False",
            "True",
            "It can never be forced",
            "True",
            "You cannot force garbage collection",
            "False",
            "Marketing of the final product",
            "GNU/Linux offers a wide range of hardware compatibility with external peripherals",
            "macOS is less expensive than Windows or GNU/Linux when considering hardware/software costs",
            "Windows updates rarely hinder the performance of software developed under the previous version",
            "Fullstack",
            "Front end",
            "Back end",
            "Server software",
            "Automatic memory management",
            "Classes and objects",
            "A blueprint for creating objects",
            "An instance of a class definition",
            "bytecode",
            "compiler",
            "Write Once, Run Anywhere",
            "It can be run on any machine that has a JRE/JVM",
            "A Just in Time Compiler",
            "When source code is converted to byte code",
            "It serves as an introduction to programming",
            "To test that all components of a new programming language were installed properly.",
            "A block of reusable code",
            "Strongly typed language",
            "A primitive variable stores a value, a reference variable stores the memory address of an object",
            "32 bits (4 bytes)",
            "double",
            "Semantic",
            "y is set equal to 5",
            "x is increased by 1",
            "postfix",
            "String",
            "Memory addresses",
            "my string",
            "To allow normal program flow",
            "Can be used with or without a label",
            "A continue directs program flow to the next loop iteration, a break immediately directs program flow out of the loop.",
            "Can be used with or without a label",
            "for loop",
            "while loop",
            "do-while loop",
            "Conditional",
            "moth",
            "False",
            "Binary search",
            "Troubleshooting",
            "Drilling down",
            "False",
            "True",
            "stack",
            "frame",
            "stack trace",
            "Throwable",
            "User input",
            "Packages create more disorganization.",
            "Only in the same class",
            "java.lang",
            "Converted to a double",
            "Converted to a float",
            "Converted to a long",
            "A template used to instantiate objects",
            "An executable element inside of a class",
            "An instance of a class in memory",
            "A variable that stores the reference to an object in memory",
            "Classes can be developed independently of each other",
            "0",
            "constructors have no return type",
            "initializing object state",
            "this",
            "Integer",
            "Boxing",
            "Unboxing",
            "Autoboxing",
            "ArrayList",
            "It does not preserve the order in which elements are inserted.",
            "eliminate()",
            "firstIndexOf()",
            "The exception propagates up through the call stack until it is handled by the JVM which will then terminate the program.",
            "A try-catch block",
            "throws",
            "finally",
            "Can be created by extending any exception class",
            "An unchecked exception",
            "Extend any existing exception class",
            "So that we write the code that handles the exception",
            "Base classes are usually more specific than derived classes.",
            "Prime numbers",
            "Single inheritance",
            "Hierarchical inheritance"
    };

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int result;
    int seconds = 60;
    int current_score = 0;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JRadioButton buttonA = new JRadioButton();
    JRadioButton buttonB = new JRadioButton();
    JRadioButton buttonC = new JRadioButton();
    JRadioButton buttonD = new JRadioButton();
    JRadioButton buttonTrue = new JRadioButton();
    JRadioButton buttonFalse = new JRadioButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel answer_labelTrue = new JLabel();
    JLabel answer_labelFalse = new JLabel();
    JLabel time_label = new JLabel();
    JLabel score_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JLabel score_board = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();


    //constructor
    public Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,650);
        frame.getContentPane().setBackground(new Color(50,52,55));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0,0,650,40);
        textField.setBackground(new Color(50,52,55));
        textField.setForeground(new Color(226,183,20));
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setFont(new Font("Monospaced", Font.BOLD, 30));
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setEditable(false);

        textArea.setBounds(0,50,1000,40);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(50,52,55));
        textArea.setForeground(new Color(244,244,245));
        textArea.setBorder(BorderFactory.createEmptyBorder());
        textArea.setFont(new Font("Monospaced", Font.BOLD, 25));
        textArea.setCaretPosition(0);
        textArea.setEditable(false);

        CheckboxGroup checkBox = new CheckboxGroup();
        buttonA.setBounds(12, 150, 15,15);
        buttonA.setBorderPainted(false);
        buttonA.setBackground(new Color(50,52,55));
        buttonA.setForeground(new Color(226,183,20));
        buttonA.addActionListener(this);

        buttonB.setBounds(12, 250, 15,15);
        buttonB.setBorderPainted(false);
        buttonB.setBackground(new Color(50,52,55));
        buttonB.setForeground(new Color(226,183,20));
        buttonB.addActionListener(this);

        buttonC.setBounds(12, 350, 15,15);
        buttonC.setBorderPainted(false);
        buttonC.setBackground(new Color(50,52,55));
        buttonC.setForeground(new Color(226,183,20));
        buttonC.addActionListener(this);

        buttonD.setBounds(12, 450, 15,15);
        buttonD.setBorderPainted(false);
        buttonD.setBackground(new Color(50,52,55));
        buttonD.setForeground(new Color(226,183,20));
        buttonD.addActionListener(this);

        answer_labelA.setBounds(40,105,1000,100);
        answer_labelA.setBackground(new Color(50,52,55));
        answer_labelA.setForeground(new Color(226,183,20));
        answer_labelA.setFont(new Font("Monospaced", Font.PLAIN, 14));

        answer_labelB.setBounds(40,205,1000,100);
        answer_labelB.setBackground(new Color(50,52,55));
        answer_labelB.setForeground(new Color(226,183,20));
        answer_labelB.setFont(new Font("Monospaced", Font.PLAIN, 14));

        answer_labelC.setBounds(40,305,1000,100);
        answer_labelC.setBackground(new Color(50,52,55));
        answer_labelC.setForeground(new Color(226,183,20));
        answer_labelC.setFont(new Font("Monospaced", Font.PLAIN, 14));

        answer_labelD.setBounds(40,405,1000,100);
        answer_labelD.setBackground(new Color(50,52,55));
        answer_labelD.setForeground(new Color(226,183,20));
        answer_labelD.setFont(new Font("Monospaced", Font.PLAIN, 14));

        seconds_left.setBounds(950,515,100,100);
        seconds_left.setBackground(new Color(50,52,55));
        seconds_left.setForeground(new Color(226,183,20));
        seconds_left.setFont(new Font("Monospaced", Font.BOLD, 45));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(950,510,100,30);
        time_label.setBackground(new Color(50,52,55));
        time_label.setForeground(new Color(226,183,20));
        time_label.setFont(new Font("Monospaced",Font.BOLD,25));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("Time");

        score_board.setBounds(850,515,100,100);
        score_board.setBackground(new Color(50,52,55));
        score_board.setForeground(new Color(226,183,20));
        score_board.setFont(new Font("Monospaced", Font.BOLD, 45));
        score_board.setOpaque(true);
        score_board.setHorizontalAlignment(JTextField.CENTER);
        score_board.setText(String.valueOf(current_score));

        score_label.setBounds(850,510,100,30);
        score_label.setBackground(new Color(50,52,55));
        score_label.setForeground(new Color(226,183,20));
        score_label.setFont(new Font("Monospaced",Font.BOLD,25));
        score_label.setHorizontalAlignment(JTextField.CENTER);
        score_label.setText("Score");

        number_right.setBounds(425, 230, 200,100);
        number_right.setBackground(new Color(50,52,55));
        number_right.setForeground(new Color(244,244,245));
        number_right.setFont(new Font("Monospaced", Font.BOLD,55));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);
        number_right.setBorder(null);
        number_right.setText("55");

        percentage.setBounds(430,300,200,100);
        percentage.setBackground(new Color(50,52,55));
        percentage.setForeground(new Color(226,183,20));
        percentage.setFont(new Font("Monospaced", Font.BOLD, 55));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setBorder(null);
        percentage.setEditable(false);
        percentage.setText("80%");


//        frame.add(number_right);
//        frame.add(percentage);
        frame.add(score_label);
        frame.add(score_board);
        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textArea);
        frame.add(textField);
        frame.setVisible(true);

        nextQuestion();
    }
    public void nextQuestion() {
        if (index >= total_questions) {
            results();
        }
        else {
            textField.setText("Question "+ (index + 1));
            textArea.setText(questions[index]);
            answer_labelA.setText("<html>" + options[index][0] + "</html>");
            answer_labelB.setText("<html>" + options[index][1] + "</html>");
            answer_labelC.setText("<html>" + options[index][2] + "</html>");
            answer_labelD.setText("<html>" + options[index][3] + "</html>");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void displayAnswer() {

    }

    public void results() {

    }
}
