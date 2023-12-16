# MintInterview
A unique solution to a tech interview question posed at a Mentors in Tech workshop. This was a technical interview workshop.

The task given to the mock interviewee was: Write a method that takes in a string and checks to see if there are any duplicates. Without being the one who was being interviewed, I was unable to ask clarifying questions. 

I decided to try a unique approach to this question that would be quick and use very little code. I added the string to a set and compared the length of the string to the size of the set, because a set won't add anything that is not unique. If the size is the same, there are no duplicates, but if the string is longer than the set, there are duplicates.

I created methods depending on what the interviewer would have said to the clarifying questions: first a method to check for uniqueness (A is not a), then one to ignore case when checked (A = a), and finally one to ignore white space.

Then I tested my methods with six different scenarios, attempting to consider every possible case. While my approach uses extra memory to create the set, it is faster than other approaches with a linear speed  O(n) to iterate through the string and create the Set and a constant O(1) speed to check the length. 

