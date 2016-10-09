<h2 class="text-center">Welcome to Home page</h2>

 <sec:authorize access="isAuthenticated()" var="authenticated"/>
				<c:choose>
					<c:when test="${authenticated}">
						<li>
							<p class="navbar-text">
								Welcome
								<sec:authentication property="principal.username"/>
								<a id="logout" href="#">Logout</a>
							</p>
							
						</li>	
					</c:when>
					<c:otherwise>
						<li><a href="/spring-security-xml/login/">Sign In</a></li>			
					</c:otherwise>
				</c:choose>
				