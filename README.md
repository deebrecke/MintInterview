# MintInterview
A unique solution to a tech interview question posed at a Mentors in Tech workshop

This workshop was particularly helpful, not just because they showed the right way to approach a technical interview but specifically because they showed the wrong way first
First he just started coding, the longer the silence, the more my nervous giggles became outright laugh out louds!
Then when the interveiwer went to ask him about his choices, he no idea why he chose what he chose. The interviewer essentially had to ask HIM the clarifying questions he should have asked at the beginning.

His first mistake (one I have made) was to jump right into the code without asking about edge cases or even to clarify the parameters. (A string: just letters or any character? What about white space? etc)
Then he coded without talking through what he was doing/thinking. Not knowing how to answer basic questions about his logic made it look like he was just copying.

Then they started over. This time, he wasn't perfect, but he did the things he was supposed to do. He clarified the parameters, he added some test cases to check when finished.
Once he started coding, he created a new method for the code outside of main, which was also a cleaner approach. 

I decided to try a unique approach to this question that would be quick and use very little code. From what I know about sets, they won't add anything that is not unique. So I decided to add the string to a set and compare the length of the string to the size of the set. If they are the same, no duplicates, but if the string is longer than the set, there are duplicates.

I created methods depending on what the interviewer would have said to the clarifying questions: first a method to check for uniqueness (A is not a), then one to ignore case when checked (A = a), and finally one to ignore white space.
