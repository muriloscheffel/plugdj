import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import React, { Suspense, lazy } from "react";

const LoginPage = lazy(() => import("./pages/LoginPage"));

function AppRoutes() {
  return (
    <Router>
      <Suspense fallback={<div>Loading...</div>}>
        <Routes>
          <Route
            path="/login"
            element={
                <LoginPage />
            }
          />
        </Routes>
      </Suspense>
    </Router>
  );
}

export default AppRoutes;
