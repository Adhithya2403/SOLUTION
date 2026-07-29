select teacher_id,count(distinct(subject_id)) As cnt
from teacher
group by teacher_id;
