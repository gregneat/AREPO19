This folder includes a program that renames files in any given folder.
I feel that this will be extremely useful when labs are added to ACD.
To add a new lab, I suggest using the method 'shiftFileOrder' in Renamer.
This method increases the index of all labs between and including two parameters (start and end).
For example, if a lab were to be added between make a frame and make a color, the 'start' parameter 
would be 2 since the second lab is make a color.
The new order would then be 1, 3, 4, 5, etc, leaving an empty space for a new lab 2 to be added.

Note: the shiftFileOrder method only works when the labs are ordered in base 10. There are other methods
called 'renameFilesInBinary' and 'renameFilesInBase10' that will toggle between the numbering systems.

Second note: the private methods in class Renamer could be cool for a homework assignment or extra lab.
Just something to look at.
