<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Font Awesome Icon Library -->
<meta charset="utf-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  
  
<style>
.checked {
    color: orange;
    
}
</style>



</head>

<body>
    <div   >
    <a href="kgf.html"> <img src="kgf.jpg" class="img-responsive" alt="Image" width= 100%; height= "500"></a>
    </div>
<h1>KGF</h1>
<div>
<iframe width=100% height="480" src="https://www.youtube.com/embed/-KfsY-qwBS0" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</div>
<p>K.G.F: Chapter 1 is a 2018 Indian Kannada-language period action film written and directed by Prashanth Neel, 
and produced by Vijay Kiragandur under the banner Hombale films. It is the first installment in the two-part series, 
followed by K.G.F: Chapter 2. The film centers around Raja Krishnappa Bairya "Rocky", born into poverty, who arrives in Bombay 
(now Mumbai) in the 1960s, on a quest for power and wealth as desired by his dying mother. Involved with the gold mafia there,
 he is recruited to kill Garuda, the oppressive heir-in-waiting, in Kolar Gold Fields. Yash stars as Rocky, 
 while Ramachandra Raju features as Garuda. Anant Nag narrates the film while also playing a supporting role alongside Srinidhi Shetty, 
 Vasishta N. Simha, Ayyappa P. Sharma and Harish Rai.
The development of the film began in early 2015 when Neel completed writing the screenplay. However,
 filming began only two years later, in March 2017.Majority of the film is set in Kolar Gold Fields and was filmed on location.
  Bhuvan Gowda served as the cinematographer and Shrikanth as the editor. Ravi Basrur scored music for the soundtrack and the film's background.
 After a North American premiere on 20 December 2018, K.G.F: Chapter 1 was released in Kannada and in dubbed versions of Hindi, Telugu, 
 Tamil and Malayalam languages the following day, and received positive response from audiences.
 However, critics gave the film mixed reviews; while they praised the cinematography, art direction and background score on the film,
  the screenplay and editing were criticized. The film performed well commercially and collected 76 crore four days into release, 
  in the process breaking the record for the highest grossing Kannada film of all time.
  The movie was released online by Amazon Prime Video on February 5, 2019which earlier bought the digital rights for 18 crores.<p>

<br>
<form  action="Review" method="post">
<span  onmouseover="starmark( this)" onclick="starmark(this)" id="1one" style="font-size:40px;cursor:pointer;"  class="fa fa-star checked"></span>
<span onmouseover="starmark(this)" onclick="starmark(this)" id="2one"  style="font-size:40px;cursor:pointer;" class="fa fa-star "></span>
<span onmouseover="starmark(this)" onclick="starmark(this)" id="3one"  style="font-size:40px;cursor:pointer;" class="fa fa-star "></span>
<span onmouseover="starmark(this)" onclick="starmark(this)" id="4one"  style="font-size:40px;cursor:pointer;" class="fa fa-star"></span>
<span onmouseover="starmark(this)" onclick="starmark(this)" id="5one"  style="font-size:40px;cursor:pointer;" class="fa fa-star"></span>
<br/>
<input type="text"  name="comment" style="margin-top:5px;" class="form-control"  id="comment" placeholder="Enter your review" >
<!-- <button onclick="result(); return false">Get Result</button> -->
<input  type="hidden" name="rating" id="rating">
<input type="submit" value="Submit" >
<!-- <button  onclick="result()" type="button" style="margin-top:10px;margin-left:5px;" class="btn btn-lg btn-success">Submit</button> -->
</form>
<p id="countOfStars" hidden ></p>
</body>
<script>
var count;
function starmark(item)
{
count=item.id[0];
sessionStorage.starRating = count;
var subid= item.id.substring(1);
for(var i=0;i<5;i++)
{
if(i<count)
{
document.getElementById((i+1)+subid).style.color="orange";
}
else
{
document.getElementById((i+1)+subid).style.color="black";
}
}
 result();
}


 function result()
{
	 document.getElementById("countOfStars").innerHTML = count;
	 document.getElementById("rating").value=count;
// //Rating : Count
// //Review : Comment(id)
// alert("Rating : "+count+"\nReview : "+document.getElementById("comment").value);
} 



</script>
</html>