SELECT P.firstName , P.lastName , A.city , A.state
From Person as P
Left join Address as A
on P.personId = A.personId;