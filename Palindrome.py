# CHECK FOR A PLAINDROME:


def isPalindrome(s):
	return s == s[::-1]
    
s = input('Enter the name: ')
ans = isPalindrome(s)

if ans:
	print("Yes")
else:
	print("No")


