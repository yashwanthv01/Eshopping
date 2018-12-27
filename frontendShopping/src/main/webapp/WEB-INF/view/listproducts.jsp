<div class="container">
	<div class="row">

		<!-- displaying side bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- display the actual products -->
		<div class="col-md-9">
		<!-- Adding breadcrum component for all components -->
			<div class="row">
				<div class="col-lg-12">
				<c:if test="${userClickAllProducts == true}">
					<ol class="breadcrumb">

						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
					</c:if>
					<!-- breadcrumb components for category product only -->
					<c:if test="${userClickCategoryProduct == true}">
					<ol class="breadcrumb">

						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>
					</c:if>
					
					
				</div>
			</div>
		</div>
	</div>
</div>