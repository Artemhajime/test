/*задание 6.1*/

/*1)LMNOQRST
  2)LMNOPPQRST
  3)P
  4)LMNO
 */

/*задание 6.2*/

use sakila;
select first_name, last_name  
from actor a
where a.last_name like ('L%')
union all 
select first_name, last_name 
from customer c
where c.last_name like ('L%');

/*задание 6.3*/

use sakila;
select first_name, last_name from actor where last_name like ('L%')
union all
select first_name, last_name from customer where last_name like ('L%')
order by last_name;