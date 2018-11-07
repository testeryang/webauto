
function ObjData(key,value){
this.Key=key;
this.Value=value;
}


var list=document.getElementById("myForm").getElementsByTagName("input");//查询form下的所有input标签
var array=[]; //定义一个对象数据 存放每一个input的键值对（input中“name”为key,“value”为value）
 
for(var i=0;i<list.length && list[i];i++) //对表单中所有的input进行遍历
{
      //判断不是空的 input,进行表单提交 
      if(list[i].value!="" || list[i].value!=null)   
      {
      
           var key=list[i].name;
           var value=list[i].value;
           var s=new ObjData(key,value); //创建键值对象
           array.push(s); //把对象放入对象数组中
      }
}

var postData =  JSON.stringify(array); 

//get是通过地址栏传参数
  $.ajax({
                url :'<%=basePath%>sysparam/editForm.do?postData='+postData, 
                cache : false,
                type : "get",
                datatype : "json",
                contentType : "application/json",
                data : {postData:postData},
                success : function(data)
                {
                if(data=="1"){
//根据后台返回值确定是否操作成功
}
                }
  });

