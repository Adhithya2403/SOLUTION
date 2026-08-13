select class from courses 
group by class 
Having count(*)>=5;