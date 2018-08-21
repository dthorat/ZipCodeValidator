# ZipCodeValidator
Java Coding Exercise

################ Problem Statement #######################

Sometimes items cannot be shipped to certain zip codes, and the rules for these restrictions are stored as a series of ranges of 5-digit codes. 

For example, if the ranges are:

[94133,94133] [94200,94299] [94600,94699]

Then the item can be shipped to zip code 94199, 94300, and 65532, but cannot be shipped to 94133, 94650, 94230, 94600, or 94299.

Any item might be restricted based on multiple sets of these ranges obtained from multiple sources.

PROBLEM

Given a collection of 5-digit ZIP code ranges (each range includes both their upper and lower bounds), provide an algorithm that produces the minimum number of ranges required to represent the same restrictions as the input. 

NOTES

- The ranges above are just examples, your implementation should work for any set of arbitrary ranges
- Ranges may be provided in arbitrary order
- Ranges may or may not overlap
- Your solution will be evaluated on the correctness and the approach taken, and adherence to coding standards and best practices

EXAMPLES

If the input = [94133,94133] [94200,94299] [94600,94699]
Then the output should be = [94133,94133] [94200,94299] [94600,94699]

If the input = [94133,94133] [94200,94299] [94226,94399]
Then the output should be = [94133,94133] [94200,94399]

Evaluation Guidelines

Your work will be evaluated against the following criteria:
- Successful implementation
- Efficiency of the implementation
- Design choices and overall code organization
- Code quality and best practices

################################ Solution ##################################

###################### Java Files Description ######################
1. ZipcodeDeliveryValidator.java : Main class that reads the input and validates the zipcode through ZipcodeUtil.Java
2. Zipcode.java : Domain class to store the lower and upper bound of zipcode
3. ZipcodeComparator.java : To sort based on the lower bound of zipcode from the list
4. ZipcodeUtil.java : Responsible for validating the input and returns the output list

###################### How to run ######################
1. Check out the project from the repository
2. Execute the ZipcodeDeliveryValidator.java class as normal java application from eclipse or by using command line interface
3. Assumed input will be string as mentioned in the problem statement
   e.g. [94133,94133] [94200,94299] [94600,94699] or [94133,94133] [94200,94299] [94226,94399]
4. Output will be in same format as mentioned in the problem statement
   e.g. [94133,94133] [94200,94299] [94600,94699] or [94133,94133] [94200,94399]
   
