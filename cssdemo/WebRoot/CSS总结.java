
һ��CSS���
	1��css��ʲô
		css����������html��ʽ��һ������(�ٷ����壺�����ʽ��)
		�����ʽ��
			���Ǽ��ϵ���˼
			��ʽ������css��һЩ����
			��������ǲ��ĸ��ǣ�ͬһ��html��ǩ����ͬ��css��ʽ���ε�ʱ���г�ͻ��ʹ�����ȼ��ߵģ�����ͻ�Ĳ��ֹ���ʹ��
	
	2��css����ʲô��
		2.1��css��������html��ǩ��ʹhtml���и��õı���
		2.2����ǿ��ͬ��ʽ�ĸ�����
		2.3��htmlҳ������������ʽ��ȫ�ֿ���������ڹ���
	
	3��css���뷽ʽ����д�淶
		3.1����Ƕ��ʽ
			������html��ǩ��ʹ��style��������css��ʽ
			
			��д�淶��
				(1) ��html��ǩ��ʹ��style����
				(2) ���Ե�д����
					���ԣ�����ֵ��
					�������֮��ʹ�÷ֺ�;����
			���磺
				<div style="color:red;font-size:30px">����һ����Ƕ��ʽ��</div>
	
			�ô���
				�Ķ������ʱ���ܷ���Ŀ�����ǩ����ʽ
			�׶ˣ�
				������û��
			
		3.2���ڲ���ʽ
			������head��ǩ��ʹ��style��ǩ��css��ʽ����
			
			���磺
				<head>
					<style type="text/css">
						div{color:red;font-size:30px;}
					</style>
				</head>
				<body>
					<!-- �ڲ���ʽ -->
					<div>����һ���ڲ���ʽ��</div>
				</body>
			
			��д�淶��
				(1) ��head��ʹ��style��ǩ����css��ʽ�İ���<style type="text/css">
					���ԣ�
						type="text/css"  
					�������ã�
						�Ǹ�֪���������δ�����Ҫcss���������н���
						
				(2) �﷨��ѡ����{css������}
					
				(3) ���Ե�д�������ԣ�����ֵ���������֮��ʹ�÷ֺ�;����
	
			�ô���
				��������Ը�
			�׶ˣ�
				��дʱ��Բ�����
		
		3.3���ⲿ��ʽ
			���ǽ�css��ʽд��һ��������css�ļ��� ˭��˭����
			
			��д�淶�� 
				(1) ����.css�ļ� ��css��ʽд��
				(2) ��head��ǩ��ʹ��<link>��ǩ����css�ļ�������
					<link rel="stylesheet" type="text/css" href="style.css" />
					���ԣ�
						rel:relation����д ���������ļ���html����Ĺ�ϵ ��ʽ��
						type="text/css"  
							���ã�
								�Ǹ�֪���������δ�����Ҫcss���������н���
						href:��Ҫ�����css��·��
				(3) ���Ե�д�������ԣ�����ֵ���������֮��ʹ�÷ֺ�;����

			�ص㣺
				��д�ϱȽϷ���,�����Լ�ǿ
				
		3.4��@import��ʽ
			<style type="text/css">
				@IMPORT url("style.css");
			</style>	
			
			link��ʽ��@import��ʽ������
				(1) link��ʽ���ȼ���css �ټ���html 
					@import��ʽ�ǵ�html��������ڼ���css
					
				(2) link��ʽ�������֧�� 
					@import��ʽ�����������֧��
				
				(3) link��ʽ֧��js�Ķ�̬�޸�
					@import��ʽ��֧��

����CSSѡ����
		
	1������ѡ����
		ע�⣺
			����ѡ�������� �ȼ���id > class > Ԫ��
		
		1.1��Ԫ��(��ǩ)ѡ������
			�﷨��html��ǩ{css����}
			
			���磺
				<style type="text/css">
					h1{color:red;font-size: 60px}
				</style>
				
				<h1>���ǻ���ѡ����-Ԫ��ѡ����</h1>
			
		1.2��idѡ����
			�﷨��
				#id������ֵ{css����ֵ}
			ע�⣺
				id����Ψһ��
			���磺
				<style type="text/css">
					#div1{color:red;font-size: 30px}
					#div2{color:yellow;font-size: 30px}
				</style>
				
				<div id="div1">����div1</div>
				<div id="div2">����div2</div>
				
		1.3��classѡ����
			�﷨��
				.class������ֵ{css����ֵ}
			���磺
				<style type="text/css">
					/* ����ѡ����-classѡ���� */
					.div1{color:red;font-size: 30px}
					.div2{color:yellow;font-size: 30px}
				</style>
				
				<div class="div1">����div1</div>
				<div class="div2">����div2</div>
				<div class="div2">����div2</div>
	2������ѡ����
		2.1��
			�﷨��
				����ѡ����[����="����ֵ"]{css����}
			���磺
				<style type="text/css">
					input[type="text"]{
						background-color:red
					}
					input[type="password"]{
						background-color:yellow
					}
				</style>
				
				<form action="" name="" method="">
					�û�����<input type="text"/><br/>
					���룺<input type="password"/>
				</form>
	
	3��αԪ��ѡ����
		a��ǩ��αԪ��ѡ����
			��ֹ״̬��
				a:link{css��ʽ}
			����״̬��
				a:hover{css��ʽ}
			�״̬��
				a:active{css��ʽ}
			���״̬��
				a:visited{css��ʽ}
		���磺
			<style type="text/css">
				a:link{color: black;}
				a:hover{color: red;}
				a:active{color: blue;}
				a:visited{color: #999999;}
			</style>
			
			 <a href="#">����Ұ�</a>
	
	4���㼶ѡ����
		�﷨��
			��ѡ����  ��ѡ���� .... ...{css��ʽ}
		���磺	
			<div id="div1">
				<div class="mydiv1">
					<span>����div1�����mydiv1�����span</span>
				</div>
				<div class="mydiv2">
					<span>����div1�����mydiv2�����span</span>
				</div>
			</div>
			<div id="div2">
				<div class="mydiv1">
					<span>����div2�����mydiv1�����span</span>
				</div>
				<div class="mydiv2">
					<span>����div2�����mydiv2�����span</span>
				</div>
			</div>
	
			<style type="text/css">
				#div1 .mydiv2 span{color:red} 
			</style>
	
����CSS����(��ʽ)������ֵ
	1����������
		font-size:�ֺ�
		font-family:�����ִ��
		
	2���ı�����
		color����ɫ
		text-align:���뷽ʽ
		text-decoration:�»���(�����ڴ󲿷ֱ�ǩ)
			ȡֵ��
				none��ȡ��(û���»���)
				uderline:����(��)�»���
	����(1��2)��
		<style type="text/css">
			span{
				color:red;
				font-size: 30px;
				font-family: ����;
			}
			div{
				background-color: green;
				text-align: center; 
			}
		</style>
		
		<span>����span</span>
		<div>����div</div>
	
	3����������
		background-color:������ɫ
		
		background-image:����ͼƬ
			����ֵ��д����
				url("url·��");
		
		background-repeat:ƽ�̷�ʽ 
			����ֵ��
				repeat(Ĭ��ֵ)��Ĭ��x�����y����ƽ��
				no-repeat����ƽ�̣�����ͼƬ��Сֻ��ʾһ��
				repeat-x��x��ƽ��
				repeat-y��y��ƽ��
		���磺
			<style type="text/css">
				body{
					background-color: #000000;
					background-image: url("images/dog.gif");
					background-repeat: no-repeat
				}
			</style>
			
	4�����ȡ��������
		width: 300px;
		height: 200px;
		
		���磺
			<style type="text/css">
				div{
					width: 300px;
					height: 200px;
					background-color: red
				}
			</style>

	5���б�����
		list-style-type:�б�ǰ��С��־
			ȡֵ��ȡֵ�кܶ����ʵ�����ѡ��
			���磺
				<style type="text/css">
					ul{
						list-style-type: decimal-leading-zero;
					}
				</style>
			��ͼ1
				
		list-style-image:�б���ǰ��Сͼ���־
			�����﷨��url("ͼƬ·��");s
			���磺
				<style type="text/css">
					ul{
						list-style-image: url("images/forward.gif");
					}
				</style>
			��ͼ2

	6����ʾ����
		display���Ƿ��ñ�ǩԪ����ʾ
			ȡֵ��
				none������ʾ
				block����ʾ
				inline������
		���磺
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
			
	7����������
		float:��������
			ȡֵ��	
				left�����󸡶�(����������)
				right�����Ҹ���(���ҵ�������)
			ȱ��:
				��Ը�Ԫ�غ����ڵ�û�и�����Ԫ�ز���Ī����Ӱ��
		
		clear���������
			ȡֵ��
				both(һ������»�д���)
				left
				right
			
�ġ�CSS�ĺ���ģ��(����)--�ص�
		
	��ͼ3
	
	border:���ӵı߿�
	padding:�����ڲ��ļ�϶
	margin:�����ⲿ������Ԫ��֮��ļ�϶
	
	1��border��
		��д��
			border: 10px solid green;
				ȡֵ��
					10px���߿���
					solid������(ʵ�ߡ����ߵ�)
					green���߿���ɫ
		����д����border��border-width border-style border-color
			border-width:�߿�Ŀ��
			border-style:�߿������
			border-color:�߿����ɫ
			border-top:�ϱ߿�
			border-botton:�±߿�
			border-left:��߿�
			border-right:�ұ߿�
	
	2��paddingд��
		padding:50px;�������ܶ���50px
		padding:20px 50px;����������20px ������50px
		padding:10px 30px 50px 80px;���� ��������
		padding:10px 30px 80px;������  ����  ��
		padding-top:�������ڱ߾�
		padding-botton:�������ڱ߾�
		padding-left:�������ڱ߾�
		padding-right:�������ڱ߾�
		
	3��margin
		margin:50px;�������ܶ���50px
		margin:20px 50px;����������20px ������50px
		margin:10px 30px 50px 80px;������������
		margin:10px 30px 80px;������ ���� ��
		margin-top:�������ڱ߾�
		margin-botton:�������ڱ߾�
		margin-left:�������ڱ߾�
		margin-right:�������ڱ߾�

�塢css����
	���css����




һ��js���








����js�Ļ����﷨







