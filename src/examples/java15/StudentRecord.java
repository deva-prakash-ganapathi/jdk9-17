package examples.java15;

public record StudentRecord(int rollNumber, String name, String section) {
    public StudentRecord {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
    }
}

/*
* This provides the following
* Getters rollNumber(), name(), section()
* Default constructor which takes in all the variables as parameters and assigns the values accordingly
* toString and hashCode implementations
*
* It doesn't provide any setters as the variables declared here are effectively final
* They provide an option to declare canonical constructor where we can perform additional checks and any data manipulation
* They can't have any public variables declared inside them as the only variables that can be accessed are the once that are present in the declaration
* They can't be abstract
* */