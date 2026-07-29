select date_id,make_name,count(distinct(lead_id)) As unique_leads,
count(distinct(partner_id)) As unique_partners from DailySales
group by date_id,make_name;
