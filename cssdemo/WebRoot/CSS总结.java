
一、CSS简介
	1、css是什么
		css是用来修饰html样式的一种语言(官方定义：层叠样式表)
		层叠样式表：
			表：是集合的意思
			样式：就是css的一些属性
			层叠：就是层层的覆盖，同一个html标签被不同的css样式修饰的时候，有冲突的使用优先级高的，不冲突的部分公共使用
	
	2、css能做什么？
		2.1、css可以修饰html标签，使html具有更好的表现
		2.2、增强相同样式的复用性
		2.3、html页面中内容与样式完全分开，方便后期管理
	
	3、css引入方式和书写规范
		3.1、内嵌样式
			就是在html标签中使用style属性引入css样式
			
			书写规范：
				(1) 在html标签中使用style引入
				(2) 属性的写法：
					属性：属性值，
					多个属性之间使用分号;隔开
			例如：
				<div style="color:red;font-size:30px">这是一个内嵌样式的</div>
	
			好处：
				阅读程序的时候能方便的看到标签的样式
			弊端：
				复用性没有
			
		3.2、内部样式
			就是在head标签中使用style标签将css样式包裹
			
			例如：
				<head>
					<style type="text/css">
						div{color:red;font-size:30px;}
					</style>
				</head>
				<body>
					<!-- 内部样式 -->
					<div>这是一个内部样式的</div>
				</body>
			
			书写规范：
				(1) 在head中使用style标签进行css样式的包裹<style type="text/css">
					属性：
						type="text/css"  
					属性作用：
						是告知浏览器中这段代码需要css解析器进行解析
						
				(2) 语法：选择器{css的属性}
					
				(3) 属性的写法：属性：属性值，多个属性之间使用分号;隔开
	
			好处：
				复用性相对高
			弊端：
				书写时相对不方便
		
		3.3、外部样式
			就是将css样式写在一个单独的css文件中 谁用谁调用
			
			书写规范： 
				(1) 创建.css文件 将css样式写入
				(2) 在head标签中使用<link>标签进行css文件的引入
					<link rel="stylesheet" type="text/css" href="style.css" />
					属性：
						rel:relation的缩写 引入的这个文件与html本身的关系 样式表
						type="text/css"  
							作用：
								是告知浏览器中这段代码需要css解析器进行解析
						href:需要引入的css的路径
				(3) 属性的写法：属性：属性值，多个属性之间使用分号;隔开

			特点：
				书写上比较方便,复用性极强
				
		3.4、@import方式
			<style type="text/css">
				@IMPORT url("style.css");
			</style>	
			
			link方式与@import方式的区别？
				(1) link方式是先加载css 再加载html 
					@import方式是等html加载完毕在加载css
					
				(2) link方式浏览器都支持 
					@import方式部分浏览器不支持
				
				(3) link方式支持js的动态修改
					@import方式不支持

二、CSS选择器
		
	1、基本选择器
		注意：
			基本选择器的优 先级：id > class > 元素
		
		1.1、元素(标签)选择器：
			语法：html标签{css属性}
			
			例如：
				<style type="text/css">
					h1{color:red;font-size: 60px}
				</style>
				
				<h1>我是基本选择器-元素选择器</h1>
			
		1.2、id选择器
			语法：
				#id的属性值{css属性值}
			注意：
				id具有唯一性
			例如：
				<style type="text/css">
					#div1{color:red;font-size: 30px}
					#div2{color:yellow;font-size: 30px}
				</style>
				
				<div id="div1">我是div1</div>
				<div id="div2">我是div2</div>
				
		1.3、class选择器
			语法：
				.class的属性值{css属性值}
			例如：
				<style type="text/css">
					/* 基本选择器-class选择器 */
					.div1{color:red;font-size: 30px}
					.div2{color:yellow;font-size: 30px}
				</style>
				
				<div class="div1">我是div1</div>
				<div class="div2">我是div2</div>
				<div class="div2">我是div2</div>
	2、属性选择器
		2.1、
			语法：
				基本选择器[属性="属性值"]{css属性}
			例如：
				<style type="text/css">
					input[type="text"]{
						background-color:red
					}
					input[type="password"]{
						background-color:yellow
					}
				</style>
				
				<form action="" name="" method="">
					用户名：<input type="text"/><br/>
					密码：<input type="password"/>
				</form>
	
	3、伪元素选择器
		a标签的伪元素选择器
			静止状态：
				a:link{css样式}
			悬浮状态：
				a:hover{css样式}
			活动状态：
				a:active{css样式}
			完成状态：
				a:visited{css样式}
		例如：
			<style type="text/css">
				a:link{color: black;}
				a:hover{color: red;}
				a:active{color: blue;}
				a:visited{color: #999999;}
			</style>
			
			 <a href="#">点击我把</a>
	
	4、层级选择器
		语法：
			父选择器  子选择器 .... ...{css样式}
		例如：	
			<div id="div1">
				<div class="mydiv1">
					<span>我是div1下面的mydiv1下面的span</span>
				</div>
				<div class="mydiv2">
					<span>我是div1下面的mydiv2下面的span</span>
				</div>
			</div>
			<div id="div2">
				<div class="mydiv1">
					<span>我是div2下面的mydiv1下面的span</span>
				</div>
				<div class="mydiv2">
					<span>我是div2下面的mydiv2下面的span</span>
				</div>
			</div>
	
			<style type="text/css">
				#div1 .mydiv2 span{color:red} 
			</style>
	
三、CSS属性(样式)和属性值
	1、文字属性
		font-size:字号
		font-family:字体的执行
		
	2、文本属性
		color：颜色
		text-align:对齐方式
		text-decoration:下划线(适用于大部分标签)
			取值：
				none：取消(没有下划线)
				uderline:加上(有)下划线
	例如(1和2)：
		<style type="text/css">
			span{
				color:red;
				font-size: 30px;
				font-family: 黑体;
			}
			div{
				background-color: green;
				text-align: center; 
			}
		</style>
		
		<span>我是span</span>
		<div>我是div</div>
	
	3、背景属性
		background-color:背景颜色
		
		background-image:背景图片
			属性值的写法：
				url("url路径");
		
		background-repeat:平铺方式 
			属性值：
				repeat(默认值)：默认x方向和y方向都平铺
				no-repeat：不平铺，不管图片大小只显示一张
				repeat-x：x轴平铺
				repeat-y：y轴平铺
		例如：
			<style type="text/css">
				body{
					background-color: #000000;
					background-image: url("images/dog.gif");
					background-repeat: no-repeat
				}
			</style>
			
	4、长度、宽度属性
		width: 300px;
		height: 200px;
		
		例如：
			<style type="text/css">
				div{
					width: 300px;
					height: 200px;
					background-color: red
				}
			</style>

	5、列表属性
		list-style-type:列表前的小标志
			取值：取值有很多根据实际情况选择
			例如：
				<style type="text/css">
					ul{
						list-style-type: decimal-leading-zero;
					}
				</style>
			见图1
				
		list-style-image:列表向前的小图标标志
			属性语法：url("图片路径");s
			例如：
				<style type="text/css">
					ul{
						list-style-image: url("images/forward.gif");
					}
				</style>
			见图2

	6、显示属性
		display：是否让标签元素显示
			取值：
				none：不显示
				block：显示
				inline：覆盖
		例如：
			<style type="text/css">
				#div1 {
					width:250px;
					height:300px;
					background-color:red;
					display: block
				}
				#div2 {
					width:250px;
					height:300px;
					background-color: green;
				}
			</style>
			
			<div id="div1">dsadfs</div>
			<div id="div2">dsadfs</div>
			
	7、浮动属性
		float:浮动方向
			取值：	
				left：向左浮动(从左到又排序)
				right：向右浮动(从右到左排序)
			缺点:
				会对父元素和相邻的没有浮动的元素产生莫名的影响
		
		clear：清除浮动
			取值：
				both(一般情况下会写这个)
				left
				right
			
四、CSS的盒子模型(布局)--重点
		
	见图3
	
	border:盒子的边框
	padding:盒子内部的间隙
	margin:盒子外部与其他元素之间的间隙
	
	1、border：
		简写：
			border: 10px solid green;
				取值：
					10px：边框宽度
					solid：线型(实线、虚线等)
					green：边框颜色
		正常写法：border：border-width border-style border-color
			border-width:边框的宽度
			border-style:边框的线型
			border-color:边框的颜色
			border-top:上边框
			border-botton:下边框
			border-left:左边框
			border-right:右边框
	
	2、padding写法
		padding:50px;代表四周都是50px
		padding:20px 50px;代表上下是20px 左右是50px
		padding:10px 30px 50px 80px;代表 上右下左
		padding:10px 30px 80px;代表上  左右  下
		padding-top:代表上内边距
		padding-botton:代表下内边距
		padding-left:代表左内边距
		padding-right:代表右内边距
		
	3、margin
		margin:50px;代表四周都是50px
		margin:20px 50px;代表上下是20px 左右是50px
		margin:10px 30px 50px 80px;代表上右下左
		margin:10px 30px 80px;代表上 左右 下
		margin-top:代表上内边距
		margin-botton:代表下内边距
		margin-left:代表左内边距
		margin-right:代表右内边距

五、css案例
	详见css案例




一、js简介








二、js的基本语法







